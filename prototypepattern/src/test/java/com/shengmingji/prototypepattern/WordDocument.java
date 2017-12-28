package com.shengmingji.prototypepattern;


import org.junit.Test;

import java.util.ArrayList;

public class WordDocument implements Cloneable {
    private String mText;
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
        System.out.println("-------构造函数-------");
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public void addImages(String mImages) {
        this.mImages.add(mImages);
    }

    public void show(){
        System.out.println("-------------Word Content Start-------------");
        System.out.println("mText" + mText);
        System.out.println("mImages" );
        for (String  s: mImages ) {
            System.out.println("ImageName:"+s);
        }
        System.out.println("-------------Word Content end-------------\n");

    }

    @Override
    protected WordDocument clone()  {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            //对mImaages 对象也调用clone函数进行拷贝
            doc.mImages = ((ArrayList<String>) this.mImages.clone());
            return doc;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Test
    public void main() {
        WordDocument document = new WordDocument();
        document.setmText("这是一篇文章");
        document.addImages("图片1");
        document.addImages("图片2");
        document.addImages("图片3");
        document.show();

        //拷贝一份副本
        WordDocument document2 = document.clone();
        document2.show();

        document2.setmText("这是修改过的文本2");
        document2.addImages("哈哈.png");
        document2.show();

        document.show();
    }
}
