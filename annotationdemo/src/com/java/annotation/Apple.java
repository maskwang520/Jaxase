package com.java.annotation;

import java.lang.reflect.Field;

public class Apple {
	@FruitName("Apple")
    private String appleName;
    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String appleColor;
    @FruitProvider(id = 1, name = "�����츻ʿ����", address = "�����츻ʿ����")
    private String appleProvider;
    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public void displayName(){
        System.out.println(getAppleName());
    }

}
class AnnotationParse {
	public static void main(String []args){
		 //��ӡapple.getAppleColor()Ϊnull,ע��Գ�����ûӰ�죬ֻ��������֮�󣬾Ϳ���������
		 //����ǷǱ��ע��Ϊɶ��Ҫ�����ĳ���
		 Apple apple=new Apple();
		 System.out.println(apple.getAppleColor());
		 Field[] fields = Apple.class.getDeclaredFields();
	        for (Field field : fields) {
	            //System.out.println(field.getName().toString());
	            if (field.isAnnotationPresent(FruitName.class)){
	                FruitName fruitName = field.getAnnotation(FruitName.class);
	                System.out.println("ˮ�������ƣ�" + fruitName.value());
	            }else if (field.isAnnotationPresent(FruitColor.class)){
	                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
	                System.out.println("ˮ������ɫ��"+fruitColor.fruitColor());
	            }else if (field.isAnnotationPresent(FruitProvider.class)){
	                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
	                System.out.println("ˮ����Ӧ�̱��:" + fruitProvider.id() + " ����:" + fruitProvider.name() + " ��ַ:" + fruitProvider.address());
	            }
	        }
	}
}