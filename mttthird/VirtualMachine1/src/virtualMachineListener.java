// Generated from virtualMachine.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link virtualMachineParser}.
 */
public interface virtualMachineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(virtualMachineParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(virtualMachineParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#class_}.
	 * @param ctx the parse tree
	 */
	void enterClass_(virtualMachineParser.Class_Context ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#class_}.
	 * @param ctx the parse tree
	 */
	void exitClass_(virtualMachineParser.Class_Context ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(virtualMachineParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(virtualMachineParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(virtualMachineParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(virtualMachineParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(virtualMachineParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(virtualMachineParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#for_}.
	 * @param ctx the parse tree
	 */
	void enterFor_(virtualMachineParser.For_Context ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#for_}.
	 * @param ctx the parse tree
	 */
	void exitFor_(virtualMachineParser.For_Context ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(virtualMachineParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(virtualMachineParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(virtualMachineParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(virtualMachineParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#thensection}.
	 * @param ctx the parse tree
	 */
	void enterThensection(virtualMachineParser.ThensectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#thensection}.
	 * @param ctx the parse tree
	 */
	void exitThensection(virtualMachineParser.ThensectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#whilesection}.
	 * @param ctx the parse tree
	 */
	void enterWhilesection(virtualMachineParser.WhilesectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#whilesection}.
	 * @param ctx the parse tree
	 */
	void exitWhilesection(virtualMachineParser.WhilesectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#elsesection}.
	 * @param ctx the parse tree
	 */
	void enterElsesection(virtualMachineParser.ElsesectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#elsesection}.
	 * @param ctx the parse tree
	 */
	void exitElsesection(virtualMachineParser.ElsesectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(virtualMachineParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(virtualMachineParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(virtualMachineParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(virtualMachineParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(virtualMachineParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(virtualMachineParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(virtualMachineParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(virtualMachineParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(virtualMachineParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(virtualMachineParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(virtualMachineParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(virtualMachineParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(virtualMachineParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(virtualMachineParser.IncContext ctx);
	/**
	 * Enter a parse tree produced by {@link virtualMachineParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(virtualMachineParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link virtualMachineParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(virtualMachineParser.DecContext ctx);
}