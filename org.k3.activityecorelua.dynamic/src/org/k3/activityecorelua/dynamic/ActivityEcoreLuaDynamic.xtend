package org.k3.activityecorelua.dynamic

import activityecorelua.Activity
import activityecorelua.ActivityNode
import activityecorelua.BooleanValue
import activityecorelua.BooleanVariable
import activityecorelua.Input
import activityecorelua.InputValue
import activityecorelua.IntegerValue
import activityecorelua.IntegerVariable
import activityecorelua.Value
import activityecorelua.Variable
import java.io.BufferedWriter
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStreamWriter
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.resource.XtextResourceSet
import static extension org.k3.activityecorelua.dynamic.ActivityAspect.*
import static extension org.k3.activityecorelua.dynamic.ControlFlowAspect.*
import static extension org.k3.activityecorelua.dynamic.OpaqueActionAspect.*
import static extension org.k3.activityecorelua.dynamic.InitialNodeAspect.*
import static extension org.k3.activityecorelua.dynamic.ActivityFinalNodeAspect.*
import static extension org.k3.activityecorelua.dynamic.ForkNodeAspect.*
import static extension org.k3.activityecorelua.dynamic.JoinNodeAspect.*
import static extension org.k3.activityecorelua.dynamic.MergeNodeAspect.*
import static extension org.k3.activityecorelua.dynamic.DecisionNodeAspect.*
import static extension org.k3.activityecorelua.dynamic.IntegerVariableAspect.*
import static extension org.k3.activityecorelua.dynamic.BooleanVariableAspect.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import activityecorelua.OpaqueAction
import activityecorelua.InitialNode
import activityecorelua.ActivityFinalNode
import activityecorelua.ForkNode
import activityecorelua.JoinNode
import activityecorelua.MergeNode
import activityecorelua.DecisionNode
import activityecorelua.ControlFlow
import activityecorelua.NamedElement
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import java.util.concurrent.Executors
import activityecorelua.ActivityEdge
import java.util.concurrent.Future
import java.util.concurrent.Callable
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import activityecorelua.Expression


import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.io.File
import java.util.HashMap
import java.util.Map
import java.util.Stack
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.resource.XtextResourceSet
import activityecorelua.Block
import activityecorelua.Chunk
import activityecorelua.Expression
import activityecorelua.Expression_AccessArray
import activityecorelua.Expression_AccessMember
import activityecorelua.Expression_And
import activityecorelua.Expression_CallFunction
import activityecorelua.Expression_CallMemberFunction
import activityecorelua.Expression_Concatenation
import activityecorelua.Expression_Division
import activityecorelua.Expression_Equal
import activityecorelua.Expression_Exponentiation
import activityecorelua.Expression_False
import activityecorelua.Expression_Function
import activityecorelua.Expression_Invert
import activityecorelua.Expression_Larger
import activityecorelua.Expression_Larger_Equal
import activityecorelua.Expression_Length
import activityecorelua.Expression_Minus
import activityecorelua.Expression_Modulo
import activityecorelua.Expression_Multiplication
import activityecorelua.Expression_Negate
import activityecorelua.Expression_Nil
import activityecorelua.Expression_Not_Equal
import activityecorelua.Expression_Number
import activityecorelua.Expression_Or
import activityecorelua.Expression_Plus
import activityecorelua.Expression_Smaller
import activityecorelua.Expression_Smaller_Equal
import activityecorelua.Expression_String
import activityecorelua.Expression_TableConstructor
import activityecorelua.Expression_True
import activityecorelua.Expression_VarArgs
import activityecorelua.Expression_VariableName
import activityecorelua.Field
import activityecorelua.Field_AddEntryToTable
import activityecorelua.Field_AddEntryToTable_Brackets
import activityecorelua.Field_AppendEntryToTable
import activityecorelua.Function
import activityecorelua.Functioncall_Arguments
import activityecorelua.LastStatement
import activityecorelua.LastStatement_Break
import activityecorelua.LastStatement_Return
import activityecorelua.LastStatement_ReturnWithValue
import activityecorelua.ActivityecoreluaPackage
import activityecorelua.Statement
import activityecorelua.Statement_Assignment
import activityecorelua.Statement_Block
import activityecorelua.Statement_CallFunction
import activityecorelua.Statement_CallMemberFunction
import activityecorelua.Statement_For_Generic
import activityecorelua.Statement_For_Numeric
import activityecorelua.Statement_FunctioncallOrAssignment
import activityecorelua.Statement_GlobalFunction_Declaration
import activityecorelua.Statement_If_Then_Else
import activityecorelua.Statement_If_Then_Else_ElseIfPart
import activityecorelua.Statement_LocalFunction_Declaration
import activityecorelua.Statement_Local_Variable_Declaration
import activityecorelua.Statement_Repeat
import activityecorelua.Statement_While

import static extension org.k3.activityecorelua.dynamic.BlockAspect.*
import static extension org.k3.activityecorelua.dynamic.EObjectAspect.*
import static extension org.k3.activityecorelua.dynamic.EOperationAspect.*
import static extension org.k3.activityecorelua.dynamic.ExpressionAspect.*
import static extension org.k3.activityecorelua.dynamic.Statement_If_Then_Else_ElseIfPartAspect.*

import static extension org.k3.activityecorelua.dynamic.StatementAspect.*
import static extension org.k3.activityecorelua.dynamic.LastStatementAspect.*
import java.util.Scanner
import java.util.ArrayList
import activityecorelua.EObject
import activityecorelua.EClass
import activityecorelua.EOperation

class Context {
	public Context parent
	public Stack<Object> values = new Stack<Object>
	public Map<String, Object> variables = new HashMap<String, Object>
	public Map<String, Function> functions = new HashMap<String, Function>

	public Trace output;
	public Activity activity;
	public List<InputValue> inputValues ;
	public JoinNode node ;

	new() {
	}

	new(Trace c, Activity a, List<InputValue> inputValues, Context parent) {
		this.output = c
		this.activity = a
		this.inputValues = inputValues
		this.parent = parent
	}

}


class Main {
	protected XtextResourceSet resourceSet ;
	protected ResourceSet resourceSetxmi ;

	def static void main(String[] args) {
		new Main().run(args);
	}

	def void run(String[] args) {
		resourceSet = new XtextResourceSet();
		resourceSetxmi = new ResourceSetImpl();
		//LuaStandaloneSetup.doSetup();

		if (!EPackage.Registry.INSTANCE.containsKey(ActivityecoreluaPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(ActivityecoreluaPackage.eNS_URI, ActivityecoreluaPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl);
		var objects = getObjects("test.activityecorelua")
		var start = System.nanoTime;
		val c = new Context
		objects.forEach[e|e.execute(c)]
		var stop = System.nanoTime;
		println("time to execute in ns" + ( stop - start))

	}

	def List<EObject> getObjects(String modelPath) {
		var resource = resourceSetxmi.getResource(createFileURI(modelPath), true);
		val list = new ArrayList<EObject>()
		resource.getContents().forEach[e|list.add(e as EObject )]
		return list
	}

	def URI createFileURI(String path) {
		return URI.createFileURI(createFile(path).getAbsolutePath());
	}
	def File createFile(String path) {
		return new File(path);
	}

}


class Util {
	public static final Object LINE_BREAK = System.getProperty("line.separator");

}
 
@Aspect(className=EObject)
class EObjectAspect  {

	def void execute(Context c) {
		_self.eeClass.EOperations.filter[op|op.name == "start"].forEach[e|e.execute(c)]
	}
}
 

@Aspect(className=EOperation)
class EOperationAspect  {

	def void execute(Context c) {
		_self.activity.execute(c)
	}
}


class Offer {
	public List<Token> offeredTokens = new ArrayList<Token>() ;

	def boolean hasTokens() {
		removeWithdrawnTokens();
		return offeredTokens.size() > 0;
	}

	def void removeWithdrawnTokens() {
		val tokensToBeRemoved = new ArrayList<Token>();
		offeredTokens.forEach [ token |
			if (token.withdrawn) {
				tokensToBeRemoved.add(token);
			}
		]
		this.offeredTokens.removeAll(tokensToBeRemoved);
	}

}

abstract class Token {

	public ActivityNode holder

	def Token transfer(ActivityNode holder) {
		if (this.holder != null) {
			this.withdraw();
		}
		this.holder = holder;
		return this;
	}

	def void withdraw() {
		if (!isWithdrawn()) {
			holder.removeToken(this);
			holder = null;
		}
	}

	def boolean isWithdrawn() {
		return this.holder == null;
	}
}

class Trace {
	public List<ActivityNode> executedNodes = new ArrayList<ActivityNode>();
}

class ControlToken extends Token {
}

class ForkedToken extends Token {
	public Token baseToken ;
	public Integer remainingOffersCount;
}


@Aspect(className=Activity)
class ActivityAspect extends NamedElementAspect {

	Trace trace

	@ReplaceAspectMethod
	def void main(List<InputValue> value) {
		var c = new Context
		c.inputValues = value
		c.activity = _self
		_self.trace = new Trace;
		c.output = _self.trace
		value?.forEach[v|v.getVariable().setCurrentValue(v.getValue());]
		_self.nodes.forEach[n|n.running =true]
		_self.execute(c)
	}

	@OverrideAspectMethod
	def void execute(Context c) {
		_self.locals.forEach[v|v.init(c)]
		_self.nodes.filter[node|node instanceof InitialNode].get(0).execute(c)
		
		var list =  _self.nodes.filter[node|node.hasOffers]
		while (list!=null && list.size>0 ){
			list.get(0).execute(c)
			list =  _self.nodes.filter[node|node.hasOffers]
			
		}
	}

	def void reset() {
		_self.trace = null;
	}

	def void writeToFile() {
		var text = _self.printTrace();
		try {
			var writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(new File("trace/" + _self.getName() + ".txt"))));
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	def String printTrace() {
		val text = new StringBuffer();
		_self.trace.executedNodes.forEach[n|text.append(n.getName()); text.append(Util.LINE_BREAK);]

		_self.getLocals().forEach [ v |
			text.append(v.print);
			text.append(Util.LINE_BREAK);
		]
		return text.toString();
	}

	def int getIntegerVariableValue(String variableName) {
		var currentValue = _self.getVariableValue(variableName);
		if (currentValue instanceof IntegerValue) {
			var integerValue = currentValue as IntegerValue;
			return integerValue.getValue();
		}
		return -1;
	}

	def boolean getBooleanVariableValue(String variableName) {
		var currentValue = _self.getVariableValue(variableName);
		if (currentValue instanceof BooleanValue) {
			var booleanValue = currentValue as BooleanValue;
			return booleanValue.isValue();
		}
		return false;
	}

	def Value getVariableValue(String variableName) {
		var variable = _self.getVariable(variableName);
		var currentValue = variable.getCurrentValue();
		return currentValue;
	}

	def Variable getVariable(String variableName) {
		var allVariables = new ArrayList<Variable>();
		allVariables.addAll(_self.getLocals());
		allVariables.addAll(_self.getInputs());
		for (Variable var1 : allVariables) {
			if (var1.getName().equals(variableName)) {
				return var1;
			}
		}
		return null;
	}

	def void writeTrace() {
		_self.writeToFile;
		_self.reset();
	}

}

@Aspect(className=NamedElement)
class NamedElementAspect {
	def void execute(Context c) {
	}
}

@Aspect(className=ActivityNode)
class ActivityNodeAspect extends org.k3.activityecorelua.dynamic.NamedElementAspect {
	List<Token> heldTokens = new ArrayList<Token>

	@OverrideAspectMethod
	def void execute(Context c) {
		//_self.sendOffers1(_self.takeOfferdTokens1)
	}

	def void terminate() {
		_self.running = false;
	}

	def boolean isReady() {
		return _self.isRunning();
	}

	def void sendOffers(List<Token> tokens) {
		_self.outgoing.forEach[edge|edge.sendOffer(tokens)]		
	}

	def List<Token> takeOfferdTokens() {
		val allTokens = new ArrayList<Token>();
		_self.getIncoming.forEach[edge|
			val tokens = edge.takeOfferedTokens();
			for (Token token : tokens) {
				token.withdraw();
				token.holder=_self
			}
			allTokens.addAll(tokens);
		]
		return allTokens;
	}

	/**
	 * @generated NOT
	 */
	def void addTokens(List<Token> tokens) {
		for (Token token : tokens) {
			var transferredToken = token.transfer(_self);
			_self.heldTokens.add(transferredToken);
		}
	}

	def boolean hasOffers() {
		var hasOffer = true;
		for (ActivityEdge edge : _self.getIncoming()) {
			if (!edge.hasOffer()) {
				hasOffer = false;
			}
		}
		return hasOffer;
	}

	def void removeToken(Token token) {
		_self.heldTokens.remove(token);
	}

}

@Aspect(className=ActivityEdge)
class ActivityEdgeAspect extends NamedElementAspect {
	public List<Offer> offers = new ArrayList<Offer>

	def void sendOffer(List<Token> tokens) {
		val offer = new Offer;
		tokens.forEach[token|offer.offeredTokens.add(token)];
		_self.offers.add(offer);
	}

	def List<Token> takeOfferedTokens() {
		val tokens = new ArrayList<Token>()
		_self.offers.forEach[o|tokens.addAll(o.offeredTokens)]
		_self.offers.clear();
		return tokens;
	}

	def boolean hasOffer() {
		return _self.offers.exists[o1|o1.hasTokens()]
	}

}

@Aspect(className=ControlFlow)
class ControlFlowAspect extends ActivityEdgeAspect {

}

@Aspect(className=OpaqueAction)
class OpaqueActionAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		_self.expressions.forEach[e|e.execute(c)]
		_self.sendOffers(_self.takeOfferdTokens)
	}
}

@Aspect(className=InitialNode)
class InitialNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		var r = new ControlToken
		r.holder = _self
		var list = new ArrayList<Token>
		list.add(r)
		_self.sendOffers(list)
		c.output.executedNodes.add(_self)
	}
	@OverrideAspectMethod
	def boolean hasOffers() {		
		return false;
	}
	
}



@Aspect(className=ActivityFinalNode)
class ActivityFinalNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		_self.sendOffers(_self.takeOfferdTokens)
	}
}


@Aspect(className=ForkNode)
class ForkNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		var tokens  =_self.takeOfferdTokens	
		var forkedTokens = new ArrayList<Token>();
		for(Token token : tokens) {
			var forkedToken = new ForkedToken();
			forkedToken.baseToken = token;
			forkedToken.remainingOffersCount = _self.outgoing.size();
			forkedTokens.add(forkedToken);
		}
		_self.addTokens(forkedTokens);
		_self.sendOffers(forkedTokens);
	}
}

@Aspect(className=JoinNode)
class JoinNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		var tokens = _self.takeOfferdTokens
		tokens.forEach[t| if ((t as ForkedToken).remainingOffersCount>1){
			(t as ForkedToken).remainingOffersCount = (t as ForkedToken).remainingOffersCount -1
		}else{
			var list = new ArrayList<Token>
			list.add(t)
			_self.sendOffers(list)
		}
		]
	}
}

@Aspect(className=MergeNode)
class MergeNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)		
		_self.sendOffers(_self.takeOfferdTokens)

	}
	def boolean hasOffers() {
		return  _self.incoming.exists[edge|edge.hasOffer()]
	}
}

@Aspect(className=DecisionNode)
class DecisionNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		_self.sendOffers(_self.takeOfferdTokens)

	}
	@OverrideAspectMethod
	def void sendOffers(List<Token> tokens) {
		for (ActivityEdge edge : _self.getOutgoing()) {
			if (edge instanceof ControlFlow &&  ( edge as ControlFlow).guard != null) {
				if ((( edge as ControlFlow).guard.currentValue as BooleanValue).value) {
					edge.sendOffer(tokens);
				}
			}		
		}
	}
}

@Aspect(className=Variable)
class VariableAspect {
	def void execute(Context c) {
	}

	def void init(Context c) {
		_self.currentValue = _self.initialValue
	}

	def String print() {
	}
}

@Aspect(className=IntegerVariable)
class IntegerVariableAspect extends org.k3.activityecorelua.dynamic.VariableAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
	}

	@OverrideAspectMethod
	def String print() {
		var text = new StringBuffer();
		text.append(_self.getName());
		text.append(" = ");
		text.append((_self.getCurrentValue() as IntegerValue).getValue());
		return text.toString();
	}
}

@Aspect(className=BooleanVariable)
@OverrideAspectMethod
class BooleanVariableAspect extends org.k3.activityecorelua.dynamic.VariableAspect {
	def void execute(Context c) {
	}

	@OverrideAspectMethod
	def String print() {
		var text = new StringBuffer();
		text.append(_self.getName());
		text.append(" = ");
		text.append((_self.getCurrentValue() as BooleanValue).isValue());
		return text.toString();
	}

}





@Aspect(className=Chunk)
abstract class ChunkAspect {
	def void execute(Context c) 
}

@Aspect(className=Block)
class BlockAspect extends ChunkAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.statements.forEach [ s |
			s.execute(c)
		]
		_self.returnValue?.execute(c)  //.execute(c)

	}
}

@Aspect(className=Statement_GlobalFunction_Declaration)
class Statement_GlobalFunction_DeclarationAspect extends StatementAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
			c.functions.put(_self.prefix.get(0), _self.function)
	}
}

@Aspect(className=Expression_VariableName)
class Expression_VariableNameAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//println(_self.variable)
		c.values.push(c.variables.get(_self.variable))

	}
}

@Aspect(className=Statement_Assignment)
class Statement_AssignmentAspect extends Statement_FunctioncallOrAssignmentAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		var variableName  = (_self.variable.get(0) as Expression_VariableName).variable
		_self.values.get(0).execute(c)
		var value = c.values.pop
		c.variables.put(variableName as String, value)
	}
}

@Aspect(className=Statement_CallFunction)
class Statement_CallFunctionAspect extends Statement_FunctioncallOrAssignmentAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		var x = _self.object
		switch x {
			Expression_VariableName case x.variable.equals("print"): {
				_self.arguments.arguments.get(0).execute(c)
				println(c.values.pop)
				return
			}
		}
		if (_self.object instanceof Expression_VariableName){
				var function = c.functions.get((_self.object as Expression_VariableName).variable)
				if (function != null){
					val params = new ArrayList()
					_self.arguments.arguments.forEach[args | args.execute(c)  params.add(c.values.pop)]				
					var newC = new Context
					newC.parent = c
					newC.variables.putAll(c.variables)
					newC.functions.putAll(c.functions)
					newC.values.addAll(c.values)
					for (var i = 0 ; i< function.parameters.size;i++){
						newC.variables.put(function.parameters.get(i),params.get(i))	
					}
					function.body.execute(newC)
					c.values.push(newC.values.pop)
				}
		}
		
			
	}
}

@Aspect(className=Expression_CallFunction)
class Expression_CallFunctionAspect extends ExpressionAspect {
		@OverrideAspectMethod
		def void execute(Context c) {
		_self.object.execute(c)
		if(_self.arguments.arguments.size>0){
			_self.arguments.arguments.get(0).execute(c)
			var res = c.values.pop
			if ("\"*number\"".equals(res)){
				var res1 = c.values.pop				
				c.values.push(Double.parseDouble(""+res1))
				return
			}
		}
		if (_self.object instanceof Expression_VariableName){
				var function = c.functions.get((_self.object as Expression_VariableName).variable)
				if (function != null){
					val params = new ArrayList()
					_self.arguments.arguments.forEach[args | args.execute(c)  params.add(c.values.pop)]				
					var newC = new Context
					newC.parent = c
					newC.variables.putAll(c.variables)
					newC.functions.putAll(c.functions)
					newC.values.addAll(c.values)
					for (var i = 0 ; i< function.parameters.size;i++){
						newC.variables.put(function.parameters.get(i),params.get(i))	
					}
					function.body.execute(newC)
					c.values.push(newC.values.pop)
					//println(newC.values.peek)
				}
		}
	}
}

@Aspect(className=Expression_AccessMember)
class Expression_AccessMemberAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		if (_self.memberName.equals("read")) {
			var x = _self.object
			switch x {
				Expression_VariableName case x.variable.equals("io"): {
					var scanIn = new Scanner(System.in);
					var in = scanIn.nextLine();
					scanIn.close();
					c.values.push(in)
				}
			}
		}
	}
}

@Aspect(className=LastStatement)
abstract class LastStatementAspect {
	def void execute(Context c) 
}

@Aspect(className=LastStatement_Return)
class LastStatement_ReturnAspect extends LastStatementAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TOCHECK
	}
}

@Aspect(className=LastStatement_Break)
class LastStatement_BreakAspect extends LastStatementAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TODO
	}
}

@Aspect(className=Statement)
abstract class StatementAspect {
	def void execute(Context c) 
}

@Aspect(className=Statement_Block)
class Statement_BlockAspect extends StatementAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TOCHECK
		
	}
}

@Aspect(className=Statement_While)
class Statement_WhileAspect extends StatementAspect {
	
	
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.expression.execute(c)
		while(c.values.pop as Boolean){
		_self.block.execute(c)				
		_self.expression.execute(c)
		}
		
	}
}

@Aspect(className=Statement_Repeat)
class Statement_RepeatAspect extends StatementAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		do{
		_self.block.execute(c)				
		_self.expression.execute(c)
		
		}while(c.values.pop as Boolean)	
	}
}

@Aspect(className=Statement_If_Then_Else)
class Statement_If_Then_ElseAspect extends StatementAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.ifExpression.execute(c)
		if (c.values.pop as Boolean){
			_self.ifBlock.execute(c)
			return
		}
		_self.elseIf.forEach[e | e.evalExpr(c)
			if (c.values.pop as Boolean){
				e.execute(c)
				return 
			}
		]
		
		_self.elseBlock.execute(c)			
		
	}
}

@Aspect(className=Statement_If_Then_Else_ElseIfPart)
class Statement_If_Then_Else_ElseIfPartAspect {
	def void evalExpr(Context c) {
		_self.elseifExpression.execute(c)
	}
	
	def void execute(Context c) {
			_self.elseifBlock.execute(c)
	}
}

@Aspect(className=Statement_For_Numeric)
class Statement_For_NumericAspect extends StatementAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TODO
		
	}
}

@Aspect(className=Statement_For_Generic)
class Statement_For_GenericAspect extends StatementAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TODO
	}
}

@Aspect(className=Statement_LocalFunction_Declaration)
class Statement_LocalFunction_DeclarationAspect extends StatementAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TODO		
	}
}

@Aspect(className=Statement_Local_Variable_Declaration)
class Statement_Local_Variable_DeclarationAspect extends StatementAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TODO
	}
}

@Aspect(className=Statement_FunctioncallOrAssignment)
abstract class Statement_FunctioncallOrAssignmentAspect extends StatementAspect {
	@OverrideAspectMethod
	def void execute(Context c) 
}

@Aspect(className=Expression)
abstract class ExpressionAspect extends Statement_FunctioncallOrAssignmentAspect {
	def void execute(Context c)
}

@Aspect(className=Expression_Nil)
class Expression_NilAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.values.push(Void)		
	}
}

@Aspect(className=Expression_True)
class Expression_TrueAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
				c.values.push(true)
		
	}
}

@Aspect(className=Expression_False)
class Expression_FalseAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
				c.values.push(false)
		
	}
}

@Aspect(className=Expression_Number)
class Expression_NumberAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.values.push(_self.value)
	}
}

@Aspect(className=Expression_VarArgs)
class Expression_VarArgsAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TODO
	}
}

@Aspect(className=Expression_String)
class Expression_StringAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.values.push(_self.value)
	}
}

@Aspect(className=Expression_Function)
class Expression_FunctionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TOCHECK
	}
}

@Aspect(className=Expression_TableConstructor)
class Expression_TableConstructorAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TODO
	}
}

@Aspect(className=Function)
class FunctionAspect {
	def void execute(Context c) {
		//TOCHECK
	}
}

@Aspect(className=Functioncall_Arguments)
class Functioncall_ArgumentsAspect {
	def void execute(Context c) {
		//TOCHECK
	}
}

@Aspect(className=Field)
abstract class FieldAspect {
	def void execute(Context c) 
}

@Aspect(className=Field_AddEntryToTable_Brackets)
class Field_AddEntryToTable_BracketsAspect extends FieldAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TODO
	}
}

@Aspect(className=Field_AddEntryToTable)
class Field_AddEntryToTableAspect extends FieldAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TODO
	}
}

@Aspect(className=Field_AppendEntryToTable)
class Field_AppendEntryToTableAspect extends FieldAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TODO
	}
}

@Aspect(className=LastStatement_ReturnWithValue)
class LastStatement_ReturnWithValueAspect extends LastStatement_ReturnAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.returnValues.forEach[e|e.execute(c)]
	}
}

@Aspect(className=Statement_CallMemberFunction)
class Statement_CallMemberFunctionAspect extends Statement_FunctioncallOrAssignmentAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TODO		
	}
}

@Aspect(className=Expression_Or)
class Expression_OrAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.left.execute(c)
		var  left =c.values.pop as Boolean 
		_self.right.execute(c) 
		var  right =c.values.pop as Boolean 	
		c.values.push(left || right)
	}
}

@Aspect(className=Expression_And)
class Expression_AndAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.left.execute(c)
		var  left =c.values.pop as Boolean 
		_self.right.execute(c) 
		var  right =c.values.pop as Boolean 	
		c.values.push(left && right)
		
	}
}

@Aspect(className=Expression_Larger)
class Expression_LargerAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
						_self.left.execute(c)
		var  left =c.values.pop as Comparable 
		_self.right.execute(c) 
		var  right =c.values.pop as Comparable 	
		c.values.push(left.compareTo(right)>0)
		
	}
}

@Aspect(className=Expression_Larger_Equal)
class Expression_Larger_EqualAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
						_self.left.execute(c)
		var  left =c.values.pop as Comparable
		_self.right.execute(c) 
		var  right =c.values.pop as Comparable
		c.values.push(left.compareTo(right)>=0) 
		
	}
}

@Aspect(className=Expression_Smaller)
class Expression_SmallerAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
				_self.left.execute(c)
		var  left =c.values.pop as Comparable 
		_self.right.execute(c) 
		var  right =c.values.pop as Comparable 	
		c.values.push(left.compareTo(right)<0)
	}
}

@Aspect(className=Expression_Smaller_Equal)
class Expression_Smaller_EqualAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
				_self.left.execute(c)
		var  left =c.values.pop as Comparable 
		_self.right.execute(c) 
		var  right =c.values.pop as Comparable 	
		c.values.push(left.compareTo(right)<=0)
		
	}
}

@Aspect(className=Expression_Equal)
class Expression_EqualAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.left.execute(c)
		var  left =c.values.pop 
		_self.right.execute(c)
		var  right =c.values.pop 	
		c.values.push(left.equals(right))
	}
}

@Aspect(className=Expression_Not_Equal)
class Expression_Not_EqualAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.left.execute(c)
		var  left =c.values.pop 
		_self.right.execute(c)
		var  right =c.values.pop 	
		c.values.push(!left.equals(right))
	}
}

@Aspect(className=Expression_Concatenation)
class Expression_ConcatenationAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.left.execute(c)
		var String left =c.values.pop as String
		_self.right.execute(c)
		var String right =c.values.pop as String		
		c.values.push(left + right)
	}
}

@Aspect(className=Expression_Plus)
class Expression_PlusAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.left.execute(c)
		var Double left =c.values.pop as Double
		_self.right.execute(c)
		var Double right =c.values.pop as Double		
		c.values.push(left + right)
	}
}

@Aspect(className=Expression_Minus)
class Expression_MinusAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.left.execute(c)
		var Double left =c.values.pop as Double
		_self.right.execute(c)
		var Double right =c.values.pop as Double		
		c.values.push(left - right)

	}
}

@Aspect(className=Expression_Multiplication)
class Expression_MultiplicationAspect extends ExpressionAspect {
	@OverrideAspectMethod	
	def void execute(Context c) {
		_self.left.execute(c)
		var Double left =c.values.pop as Double
		_self.right.execute(c)
		var Double right =c.values.pop as Double		
		c.values.push(left * right)
		
	}
}

@Aspect(className=Expression_Division)
class Expression_DivisionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.left.execute(c)
		var Double left =c.values.pop as Double
		_self.right.execute(c)
		var Double right =c.values.pop as Double		
		c.values.push(left / right)
		
	}
}

@Aspect(className=Expression_Modulo)
class Expression_ModuloAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.left.execute(c)
		var Double left =c.values.pop as Double
		_self.right.execute(c)
		var Double right =c.values.pop as Double		
		c.values.push(left % right)

	}
}

@Aspect(className=Expression_Negate)
class Expression_NegateAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.exp.execute(c)
		var Double left =c.values.pop as Double
		c.values.push(left *(-1))		
	}
}

@Aspect(className=Expression_Length)
class Expression_LengthAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.exp.execute(c)
		var String left =c.values.pop as String
		c.values.push(left.length)		
	}
}

@Aspect(className=Expression_Invert)
class Expression_InvertAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.exp.execute(c)
		var Double left =c.values.pop as Double
		c.values.push(left *(-1))	
	}
}

@Aspect(className=Expression_Exponentiation)
class Expression_ExponentiationAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		_self.left.execute(c)
		var Double left =c.values.pop as Double
		_self.right.execute(c)
		var Double right =c.values.pop as Double		
		c.values.push(Math.pow(left , right))
	}
}

@Aspect(className=Expression_CallMemberFunction)
class Expression_CallMemberFunctionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TODO
	}
}

@Aspect(className=Expression_AccessArray)
class Expression_AccessArrayAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		//TODO
	}
}

