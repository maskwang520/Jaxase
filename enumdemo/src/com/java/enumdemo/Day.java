package com.java.enumdemo;

/**
 * ��ʵö��������ĳ�Ա��static final��
 * ö��������switch
 * @author maskwang
 *
 */
public enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class EnumTest {
	Day day;

	EnumTest(Day day) {
		this.day = day;
	}

	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("��һ���ֲ���״̬");
			break;

		case FRIDAY:
			System.out.println("����о�������");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("��ĩ���˵ĸо��������");
			break;

		default:
			System.out.println("���ڸо��������ɡ�����");
			break;
		}
	}

	public static void main(String[] args) {
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumTest fifthDay = new EnumTest(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumTest sixthDay = new EnumTest(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
		EnumTest seventhDay = new EnumTest(Day.SUNDAY);
		seventhDay.tellItLikeItIs();
	}
}