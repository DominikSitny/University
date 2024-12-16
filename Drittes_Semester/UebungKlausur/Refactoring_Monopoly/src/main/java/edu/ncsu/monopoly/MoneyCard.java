package edu.ncsu.monopoly;

public class MoneyCard extends Card {
    private int amount;
    private int cardType;

    private String label;

    public MoneyCard(String label, int amount, int cardType){
        this.label = label;
        this.amount = amount;
        this.cardType = cardType;
    }

    @Override
	public void applyAction() {
        Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		currentPlayer.setMoney(currentPlayer.getMoney() + amount);
    }

    @Override
	public int getCardType() {
        return cardType;
    }

    @Override
	public String getLabel() {
        return label;
    }
}
