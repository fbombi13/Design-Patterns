package Dependency;


class Windows98 {
    private GamerKeyboard keyboard;
    private FullHdMonitor monitor;

    Windows98(GamerKeyboard keyboard, FullHdMonitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}

class Windows10 {
    private Keyboard keyboard;
    private WindowsMonitor monitor;


    Windows10(Keyboard keyboard, WindowsMonitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}


class TestDependencyInjection {
    public static void main(String[] args) {
        GamerKeyboard gamerKeyboard = new GamerKeyboard();
        StandardKeyboard standardKeyboard = new StandardKeyboard();
        FullHdMonitor monitor = new FullHdMonitor();

        Windows98 w98 = new Windows98(gamerKeyboard, monitor);
//        Windows98 w982 = new Windows98(standardKeyboard, monitor);
        Windows10 w10 = new Windows10(gamerKeyboard, monitor);
        Windows10 w102 = new Windows10(standardKeyboard, monitor);
    }
}

