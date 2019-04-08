package com.first;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {
                "24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma"};
        String[] wordListTwo = {
                "empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered"
        };
        String[] wordListThree = {
                "process", "tipping-point", "solution", "architecture", "core competency"
        };

        int oneLen = wordListOne.length;
        int twoLen = wordListTwo.length;
        int threeLen = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLen);
        int rand2 = (int) (Math.random() * twoLen);
        int rand3 = (int) (Math.random() * threeLen);

        String phrase = new StringBuilder().append(wordListOne[rand1]).append(" ").append(wordListThree[rand2]).append(" ").append(wordListThree[rand3]).toString();

        System.out.println("What we need is a " + phrase);
    }
}
