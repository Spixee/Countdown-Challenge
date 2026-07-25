package code.diegofc.base.countdown;

public record Val(int v) implements Expr {
	// instance Show Expr
	@Override
	public String toString() {
		return Expr.toStr(this);
	}
}
