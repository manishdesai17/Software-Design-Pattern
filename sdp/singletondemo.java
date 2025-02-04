// create one object only
class singleton {
    private static singleton obj;

    private singleton() {
    }

    public static singleton getinstance() {
        if (obj == null) {
            synchronized (singleton.class) {
                if (obj == null) {
                    obj = new singleton();
                }
            }
        }
        return obj;
    }
}

class singletondemo {
    public static void main(String[] args) {
        singleton s1 = singleton.getinstance();
    }
}