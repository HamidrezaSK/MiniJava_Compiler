# Generated from MiniJava.g4 by ANTLR 4.5.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .MiniJavaParser import MiniJavaParser
else:
    from MiniJavaParser import MiniJavaParser

# This class defines a complete generic visitor for a parse tree produced by MiniJavaParser.

class MiniJavaVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MiniJavaParser#goal.
    def visitGoal(self, ctx:MiniJavaParser.GoalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#mainclass.
    def visitMainclass(self, ctx:MiniJavaParser.MainclassContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#dec_class.
    def visitDec_class(self, ctx:MiniJavaParser.Dec_classContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#dec_var.
    def visitDec_var(self, ctx:MiniJavaParser.Dec_varContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#dec_method.
    def visitDec_method(self, ctx:MiniJavaParser.Dec_methodContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#mtype.
    def visitMtype(self, ctx:MiniJavaParser.MtypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#state_lrparents.
    def visitState_lrparents(self, ctx:MiniJavaParser.State_lrparentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#state_if.
    def visitState_if(self, ctx:MiniJavaParser.State_ifContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#state_while.
    def visitState_while(self, ctx:MiniJavaParser.State_whileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#state_print.
    def visitState_print(self, ctx:MiniJavaParser.State_printContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#state_def.
    def visitState_def(self, ctx:MiniJavaParser.State_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#state_array_assign.
    def visitState_array_assign(self, ctx:MiniJavaParser.State_array_assignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#expr_int.
    def visitExpr_int(self, ctx:MiniJavaParser.Expr_intContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#expr_op.
    def visitExpr_op(self, ctx:MiniJavaParser.Expr_opContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#expr_int_array.
    def visitExpr_int_array(self, ctx:MiniJavaParser.Expr_int_arrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#expr_this.
    def visitExpr_this(self, ctx:MiniJavaParser.Expr_thisContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#expr_new_array.
    def visitExpr_new_array(self, ctx:MiniJavaParser.Expr_new_arrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#expr_method_calling.
    def visitExpr_method_calling(self, ctx:MiniJavaParser.Expr_method_callingContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#expr_bool.
    def visitExpr_bool(self, ctx:MiniJavaParser.Expr_boolContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#expr_length.
    def visitExpr_length(self, ctx:MiniJavaParser.Expr_lengthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#expr_not.
    def visitExpr_not(self, ctx:MiniJavaParser.Expr_notContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#expr_lrparents.
    def visitExpr_lrparents(self, ctx:MiniJavaParser.Expr_lrparentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#expr_id.
    def visitExpr_id(self, ctx:MiniJavaParser.Expr_idContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniJavaParser#expr_array.
    def visitExpr_array(self, ctx:MiniJavaParser.Expr_arrayContext):
        return self.visitChildren(ctx)



del MiniJavaParser