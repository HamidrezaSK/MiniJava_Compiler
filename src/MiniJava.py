# Created by Wang Ao, 15300240004. All rights reserved.
__author__ = 'Wang_Ao'

import os, sys, re
from antlr4 import *
import optparse
from MiniJavaLexer import MiniJavaLexer
from MiniJavaParser import MiniJavaParser
from MiniJavaError_Presenter import MiniJava_ErrorListener
from MiniJavaSemanticAnalysis import *
from utilities import *
from antlr4.error import ErrorListener
import pydot


start_rule = 'goal'
pic = False
lisp = False
easytree = False
outname = 'default'

def semantic_check(parser_ret):
    visitor = My_Vistor()
    visitor.visit(parser_ret)

def draw(treelist):
    draw_pic(treelist, outname)
    return treelist

def process(input_stream, class_lexer, class_parser):
    lexer = class_lexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    token_stream.fill()

    parser = class_parser(token_stream)
    # setup the error listener
    #parser.removeErrorListeners()
    #parser.addErrorListener(MiniJava_ErrorListener)

    # get the starting rule and execute it
    func_start_rule = getattr(parser, start_rule)
    #parser_ret = func_start_rule()  # ?
    parser_ret = parser.goal()

    # semantic analysis
    #semantic_check(parser_ret)
    '''
    try:
        semantic_check(parser_ret)
    except:
        print ('Semantic Check Error')
    '''
    
    treelist = TreeList.toStringTreeList(parser_ret, recog=parser)
    if easytree:
        string = print_tree(treelist, 0)
        print (string)
    if lisp:
        lisp_string = parser_ret.toStringTree(recog=parser)
    if pic:
        draw(treelist)
    
    return parser_ret

def main():
    input_file = None
    output_file = None
    print ("The MiniJava AST builder, made by Ao Wang and Jiangjie Chen")
    usage = "Usage: %prog [options] inputFile\n-h for help"
    parser = optparse.OptionParser(usage=usage)
    parser.add_option('-p',
                  "--pic",  
                  metavar = "",
                  action="store_true", 
                  dest="pic",
                  default=False,  
                  help="make an AST picture by using Graphviz")  
    parser.add_option("-l",
                  "--lisptree",  
                  metavar = "",
                  action="store_true", 
                  dest="lisp",
                  default=False,  
                  help="output the lisp tree in stdout")  
    parser.add_option("-e",
                  "--easytree",  
                  metavar = "",
                  action="store_true", 
                  dest="easytree",
                  default=False,  
                  help="output the easyreading tree in stdout")
    parser.add_option(
                  "-o",
                  "--outname",
                  metavar = "FILENAME",
                  dest="outname",
                  default="default",  
                  help="output file name (outname.png)") 
    options, remain = parser.parse_args()

    global lisp, pic, outname, easytree
    lisp = options.lisp
    pic = options.pic
    easytree = options.easytree
    outname = options.outname

    try:
        input_file = remain[0]
        if outname == 'default':
            outname = input_file + '_out'
    except:
        print (usage)
        exit(0)
    
    if os.path.exists(input_file) and os.path.isfile(input_file):
        input_stream = FileStream(input_file)
        process(input_stream, MiniJavaLexer, MiniJavaParser)
    else:
        print ("[ERROR] file: %s not exist"%os.path.normpath(input_file))

if __name__ == '__main__':
    main()

    # python3 MiniJava.py -p Factorial.java 