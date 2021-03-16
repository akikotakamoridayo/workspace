package ex20210219_01_;

public class Goods {
	private String goodsName;
	private int goodsPrice;

	public Goods(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public int getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice=goodsPrice;
	}
}
