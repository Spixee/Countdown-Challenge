package code.diegofc.base.countdown;

public record App(Op op, Expr l, Expr r) implements Expr {
	// instance Show Expr
	@Override
	public String toString() {
		return Expr.toStr(this);
	}
}
