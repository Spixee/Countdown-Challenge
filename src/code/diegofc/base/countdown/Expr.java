package code.diegofc.base.countdown;

// data Expr = Val Int | App Op Expr Expr
public sealed interface Expr permits Val, App {
   // brak helper for instance Show Expr
   static String brak(Expr expr) {
      return switch (expr) {
         // brak (Val n) = show n
         case Val(var n) -> Integer.toString(n);

         // brak e       = '(' ++ show e ++ ')'
         default -> '(' + toStr(expr) + ')';
      };
   }

   // instance Show Expr
   static String toStr(Expr expr) {
      return switch (expr) {
         // show (Val n)     = show n
         case Val(var n) -> Integer.toString(n);

         // show (App o l r) = brak l ++ show o ++ brak r
         //          where
         //             brak (Val n) = show n
         //             brak e       = '(' ++ show e ++ ')'
         case App(var op, var l, var r) -> brak(l) + op + brak(r);
      };
   }
}
