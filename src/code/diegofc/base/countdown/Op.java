package code.diegofc.base.countdown;

//data Op = Add | Sub | Mul | Div
enum Op {
    Add, Sub, Mul, Div;

    // instance show Op
    @Override
    public String toString() {
       return switch (this) {
          case Add -> "+";
          case Sub -> "-";
          case Mul -> "*";
          case Div -> "/";
       };
    }
}
