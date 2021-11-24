package Template;

public class Client {
	public static void main(String[] args) {
	CreditCard cc = new VisaCard("1234123412341234,”11, 2004);
	if (cc.isValid())
		System.out.println("Valid Credit Card Information");}
	}
	public class VisaCard extends CreditCard {
	public VisaCard(String num, int expMonth, int expYear) {
	super(num, expMonth, expYear);
		}
		public boolean isNumOfDigitsValid() {
			if ((cardNum.length() == 13) ||
				(cardNum.length() == 16)) {
				return true;
			} else {
				return false;
			}
		}
		public boolean isValidPrefix() {
		String prefix = cardNum.substring(0, 1);
		if (prefix.equals("4")) {
		return true;
		} else {
		return false;
		}
		}
		public boolean isAccountInGoodStand() {
		/*
		Make necessary VISA API calls to
		perform other checks.
		*/
		return true;
		}
	}