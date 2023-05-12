public class Products {

    static int products(int x, int y) {
        if (x < y)
            return products(y, x);
        else if (y != 0) {
            return (x + products(x, y-1));
        }
        else return 0;
    }
}
