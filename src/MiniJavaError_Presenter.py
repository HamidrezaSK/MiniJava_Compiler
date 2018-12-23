# Created by Wang Ao, 15300240004. All rights reserved.
__author__ = 'Wang_Ao'
from antlr4.error.ErrorListener import *

class MiniJava_ErrorListener(ErrorListener):
    '''
    An inherited listener class to listen to the syntax errors.
    The error triger is defined in the .g4 file.
    '''

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        '''
        An overwrite of the original method.
        See https://www.antlr.org/api/Java/org/antlr/v4/runtime/ANTLRErrorListener.html for more details
        recognizer: What parser got the error
        offendingSymbol: The offending token in the input token stream
        '''
        print ( 'Line '+str(line)+':'+str(column)+' '+msg+'\n' )
        self.print_detail(recognizer, offendingSymbol, line, column, msg, e)
    
    def print_detail(self, recognizer, offendingSymbol, line, column, msg, e):
        token = recognizer.getCurrentToken()
        in_stream = token.getInputStream()
        string = str(in_stream)
        string = string.split('\n')[line-1] # get the error line
        print (string+'\n')

        # Using '*' to show the wrong token 
        # e.g. int 0number
        #          *
        # deal with \t, because \t takes 4 real characters

        # detecting the '\t' at the start
        underline = ''
        start = 0
        for char in string:
            if char == '\t':
                start += 1
                underline += '\t'
            else:
                break
        # detecting the '\t' before the error token
        for i in range(offendingSymbol.column):
            if string[start+i] == '\t':
                underline += '\t'
            else:
                underline += ' '    # usual character
        underline += '*'    # the location of the wrong token
        print (underline)
        