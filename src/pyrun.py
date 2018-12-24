# java -Xmx500M -cp . -jar antlr-4.7.2-complete.jar -visitor -Dlanguage=Python3 MiniJava.g4

from antlr4 import *
import sys, os, ast, re
import graphviz as gz
from antlr4.tree.Trees import Trees

if __name__ is not None and "." in __name__:
	from .MiniJavaParser import MiniJavaParser
	from .MiniJavaLexer import MiniJavaLexer
	from .MiniJavaVisitor import MiniJavaVisitor
	from .MiniJavaListener import MiniJavaListener
else:
	from MiniJavaParser import MiniJavaParser
	from MiniJavaLexer import MiniJavaLexer
	from MiniJavaVisitor import MiniJavaVisitor
	from MiniJavaListener import MiniJavaListener

pwd = sys.path[0]
files = [pwd + '/testfiles/Factorial.java', pwd + '/testfiles/BubbleSort.java']
test_file = files[0]


# print parse tree
def beautify_lisp_string(in_string):
	indent_size = 3
	add_indent = ' ' * indent_size
	out_string = in_string[0]  # no indent for 1st (
	indent = ''
	for i in range(1, len(in_string) - 1):
		if in_string[i] == '(' and in_string[i + 1] != ' ':
			indent += add_indent
			out_string += "\n" + indent + '('
		elif in_string[i] == ')':
			out_string += ')'
			if len(indent) > 0:
				indent = indent.replace(add_indent, '', 1)
		else:
			out_string += in_string[i]
	return out_string


def print_tree(tree, lev, parser):
	try:
		print('\t' * lev + '|——' + parser.ruleNames[tree.getRuleIndex()])
	except:
		print('\t' * lev + '|——' + str(tree))
	try:
		tree.getChildren()
	except:
		return
	for c in tree.getChildren():
		print_tree(c, lev + 1, parser)


def run():
	data = open(test_file, 'r').read()
	input = InputStream(data)
	lexer = MiniJavaLexer(input)
	stream = CommonTokenStream(lexer)
	parser = MiniJavaParser(stream)
	tree = parser.goal()
	print_tree(tree, 0, parser)
	s = beautify_lisp_string(tree.toStringTree(recog=parser))
	print(s)


if __name__ == '__main__':
	run()
