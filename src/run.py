# -*- coding: utf-8 -*-


from antlr4 import *
import sys, os, re

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

test_file = './testfiles/Factorial.java'
# test_file = './testfiles/BubbleSort.java'


def run():
	input_stream = InputStream(test_file)
	lexer = MiniJavaLexer(input_stream)
	token_stream = CommonTokenStream(lexer)
	token_stream.fill()
	parser = MiniJavaParser(token_stream)

	# parser.removeErrorListeners()
	# start_rule = getattr(parser, 'mainClass')
	# res = start_rule()
	# tree = parser.goal()


if __name__ == '__main__':
	run()
