package com.easyqa.qa.pages.util;

public class CardData {
    private int cardPriority;
    private String cardName;
    private String cardDescription;

    public CardData(int cardPriority, String cardName, String cardDescription) {
        this.cardPriority = cardPriority;
        this.cardName = cardName;
        this.cardDescription = cardDescription;
    }

    public int getCardPriority() {
        return this.cardPriority;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCardDescription() {
        return  this.cardDescription;
    }
}
