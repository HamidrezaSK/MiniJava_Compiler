from antlr4 import *
from MiniJavaVisitor import *
from MiniJavaListener import *

# We overwrite the class Visitor to check the semantic freely

class identifier_region(object):
    '''
    Using a list (dic) to store the current identifiers and their values in a region
    '''
    def __init__(self):
        self.identifiers = {}
    
    def push(self, identifier, value):
        try:
            self.identifiers[identifier] = value
        except:
            print ('identifier push error')
    
    def pop(self, identifier):
        try:
            self.identifiers.pop(identifier)
        except:
            print ('identifier pop error')
    
    def check(self, identifier):
        try:
            res = self.identifiers[identifier]
        except:
            res = False
        return res

class identifier_region_stack(object):
    '''
    Using a stack to store the valid region of a identifier
    '''
    def __init__(self):
        self._identifiers = {}   # current identifiers and their values
        self._stack = [] # the items of the stack are regions with their identifiers
        self._history_list = []  # the region history
    
    def print_stack(self):
        for region in self._stack:
            print ([ key for key in region.identifiers ])
            #print ([ (key, region.identifiers[key]) for key in region.identifiers ])
    
    def check(self, identifier):
        res = None
        for region in self._stack:
            try:
                res = region.identifiers[identifier]
            except:
                continue
        if res == None:
            return False
        else:
            return res
    
    def add_new(self):
        # add a new empty region, no new identifier
        r = identifier_region()
        self._stack.append(r)
        self._history_list.append(r)
        return r

    def get_top(self):
        return self._stack[-1]  # return the original one, not the copy
    
    def pop_last(self):
        last = self._stack.pop()
        self._history_list.append('POP')
        return last



# the implementation of the real visitor class
class My_Vistor(MiniJavaVisitor):
    def __init__(self):
        self.regions = identifier_region_stack()
    
    def 