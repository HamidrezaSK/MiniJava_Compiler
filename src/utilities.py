# Created by Wang Ao, 15300240004. All rights reserved.
__author__ = 'Wang_Ao'

import antlr4
from antlr4.tree.Trees import Trees
import io
import antlr4
from antlr4.atn.ATN import ATN
from antlr4.Token import Token
from antlr4.Utils import escapeWhitespace
from antlr4.tree.Tree import RuleNode, ErrorNode, TerminalNode
import pydot

# Treelist is modified as [node_name, subtrees]

index = 0   # index number of the tree

def print_tree_parent(treelist, buf, parent_name=''):
    global index
    node_name = 'Num.' + str(index)
    if parent_name == '':
        buf.write(node_name + ';\n')
    else:
        buf.write(parent_name + '->' + node_name + ';\n')
    
    # set the label name
    index += 1
    buf.write(node_name +'  [label="%s"] ;\n'%treelist[0])
    if treelist[1] != None:
        for subtree in treelist[1]:
            print_tree_parent(subtree, buf, node_name)  # recursive
    else:
        return

def draw_tree_node(treelist, label=''):
    string = 'graph "' + label + '"{'
    mid = ''
    global index
    index = 0
    buf = io.StringIO()
    print_tree_parent(treelist, buf)
    mid = buf.getvalue()
    string += mid + '}'
    buf.close()
    return string

def draw_pic(treelist, out_name=''):
    node = draw_tree_node(treelist, out_name)
    pydot.graph_from_dot_data(node)[0].write_png(out_name+".png")

def print_tree(treelist, height):
    string = ''
    for i in range(height):
        string += '\t|'
    string += '-- ' + treelist[0] + '\n'
    if treelist[1] != None:
        for subtree in treelist[1]:
            string += print_tree(subtree, height+1)
        return string
    else:
        return string

class TreeList(Trees):
    def __init__(self, *args, **kargs):
        super(TreeList, self).__init__(*args, **kargs)
    
    @classmethod
    def toStringTreeList(cls, t, ruleNames=None, recog=None):
        # from a tree to a list of names
        if recog is not None:
            ruleNames = recog.ruleNames
        s = escapeWhitespace(cls.getNodeText(t, ruleNames), False)
        lis = [s, None]
        if t.getChildCount()==0:
            return lis
        lis[1] = []
        for i in range(t.getChildCount()):
            lis[1].append(cls.toStringTreeList(t.getChild(i), ruleNames))
        return lis