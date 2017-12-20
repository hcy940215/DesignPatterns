package com.shengmingji.designpatterns;

/**
 * 具体的Builder类，MacBookBilder
 */

public class MacbookBuilder extends Builder {
    private Computer mComputer = new MacBook();
    @Override
    public Builder setBoard(String board) {
        mComputer.setmBoard(board);
        return this;
    }

    @Override
    public Builder setDisplay(String display) {
        mComputer.setmDisplay(display);
        return this;
    }

    @Override
    public Builder setOS() {
        mComputer.setmOs();
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
