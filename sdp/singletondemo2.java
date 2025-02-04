//count instance
class singleton {
    private static singleton obj;
    private static int count = 0;

    private singleton() {
    }

    public static singleton getinstance() {
        count = count + 1;
        if (count != 2) {
            obj = new singleton();
        } else {
            System.out.println("instance not create more than two.");
        }
        return obj;
    }
}

class singletondemo2 {
    public static void main(String[] args) {
        singleton s1 = singleton.getinstance();
        singleton s2 = singleton.getinstance();
        singleton s3 = singleton.getinstance();
    }
}