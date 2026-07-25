package code.diegofc.base.countdown;

//type Result = (Expr,Int)
record Result(Expr expr, int value) {
	@Override
	public String toString() {
		return expr.toString() + " = " + value;
	}
}
