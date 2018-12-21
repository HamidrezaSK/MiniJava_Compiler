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

class KeyPrinter(MiniJavaListener):
	def exitKey(self, ctx):
		print('oh ho.')

def run():
	data = open(test_file, 'r').read()
	input = InputStream(data)
	lexer = MiniJavaLexer(input)
	stream = CommonTokenStream(lexer)
	parser = MiniJavaParser(stream)
	tree = parser.goal()
	print(tree.toStringTree())

if __name__ == '__main__':
	run()
