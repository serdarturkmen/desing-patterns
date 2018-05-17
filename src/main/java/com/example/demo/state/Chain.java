package com.example.demo.state;

class Chain {
    private int state;

    public Chain() {
        state = 0;
    }

    public void pull() {
        if (state == 0) {
            state = 1;
            System.out.println( "   low speed" );
        } else if (state == 1) {
            state = 2;
            System.out.println( "   medium speed" );
        } else if (state == 2) {
            state = 3;
            System.out.println( "   high speed" );
        } else {
            state = 0;
            System.out.println( "   turning off" );
        }
    }
}