from antlr4 import *
import sys, os, re
import graphviz as gz

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


class AST(MiniJavaVisitor):
	def __init__(self):
		super(AST, self).__init__()

	# Visit a parse tree produced by MiniJavaParser#goal.
	def visitGoal(self, ctx: MiniJavaParser.GoalContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#mainclass.
	def visitMainclass(self, ctx: MiniJavaParser.MainclassContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#dec_class.
	def visitDec_class(self, ctx: MiniJavaParser.Dec_classContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#dec_var.
	def visitDec_var(self, ctx: MiniJavaParser.Dec_varContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#dec_method.
	def visitDec_method(self, ctx: MiniJavaParser.Dec_methodContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#mtype.
	def visitMtype(self, ctx: MiniJavaParser.MtypeContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#state_lrparents.
	def visitState_lrparents(self, ctx: MiniJavaParser.State_lrparentsContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#state_if.
	def visitState_if(self, ctx: MiniJavaParser.State_ifContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#state_while.
	def visitState_while(self, ctx: MiniJavaParser.State_whileContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#state_print.
	def visitState_print(self, ctx: MiniJavaParser.State_printContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#state_assign.
	def visitState_assign(self, ctx: MiniJavaParser.State_assignContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#state_array_assign.
	def visitState_array_assign(self, ctx: MiniJavaParser.State_array_assignContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#err_miss_RHS.
	def visitErr_miss_RHS(self, ctx: MiniJavaParser.Err_miss_RHSContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#err_lparent_closing.
	def visitErr_lparent_closing(self, ctx: MiniJavaParser.Err_lparent_closingContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#expr_this.
	def visitExpr_this(self, ctx: MiniJavaParser.Expr_thisContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#err_many_lparents.
	def visitErr_many_lparents(self, ctx: MiniJavaParser.Err_many_lparentsContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#expr_bool.
	def visitExpr_bool(self, ctx: MiniJavaParser.Expr_boolContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#expr_length.
	def visitExpr_length(self, ctx: MiniJavaParser.Expr_lengthContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#err_rparent_closing.
	def visitErr_rparent_closing(self, ctx: MiniJavaParser.Err_rparent_closingContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#expr_lrparents.
	def visitExpr_lrparents(self, ctx: MiniJavaParser.Expr_lrparentsContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#err_many_rparents.
	def visitErr_many_rparents(self, ctx: MiniJavaParser.Err_many_rparentsContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#expr_array.
	def visitExpr_array(self, ctx: MiniJavaParser.Expr_arrayContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#expr_int.
	def visitExpr_int(self, ctx: MiniJavaParser.Expr_intContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#expr_op.
	def visitExpr_op(self, ctx: MiniJavaParser.Expr_opContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#expr_int_array.
	def visitExpr_int_array(self, ctx: MiniJavaParser.Expr_int_arrayContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#expr_new_array.
	def visitExpr_new_array(self, ctx: MiniJavaParser.Expr_new_arrayContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#err_miss_LHS.
	def visitErr_miss_LHS(self, ctx: MiniJavaParser.Err_miss_LHSContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#expr_method_calling.
	def visitExpr_method_calling(self, ctx: MiniJavaParser.Expr_method_callingContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#expr_not.
	def visitExpr_not(self, ctx: MiniJavaParser.Expr_notContext):
		return self.visitChildren(ctx)

	# Visit a parse tree produced by MiniJavaParser#expr_id.
	def visitExpr_id(self, ctx: MiniJavaParser.Expr_idContext):
		return self.visitChildren(ctx)


if __name__ == '__main__':
	def print_tree(tree, lev, parser):
		# s = ''
		# for i in range(lev):
		# 	s += '|\t'
		s = lev * '\t'
		try:
			print(s + '|——' + parser.ruleNames[tree.getRuleIndex()])
		except:
			s += ('\t' * lev + '|——' + str(tree))
		try:
			tree.getChildren()
		except:
			return
		for c in tree.getChildren():
			print_tree(c, lev + 1, parser)


	pwd = sys.path[0]
	files = [pwd + '/testfiles/Factorial.java', pwd + '/testfiles/BubbleSort.java']
	test_file = files[0]
	data = open(test_file, 'r').read()
	input = InputStream(data)
	lexer = MiniJavaLexer(input)
	stream = CommonTokenStream(lexer)
	parser = MiniJavaParser(stream)
	tree = parser.goal()
