package Java.grundlagen.j3.labs.zoo.person;

import Java.grundlagen.j3.labs.zoo.person.Person;

public class Member extends Person {
    private String memberSince;
    private String membershipCardNumber;

    public Member(String name, String gender, String phoneNumber, String memberSince, String membershipCardNumber) {
        super(name, gender, phoneNumber);
        this.memberSince = memberSince;
        this.membershipCardNumber = membershipCardNumber;
    }

    public static void main(String[] args) {
        Member member1 = new Member("Fritzli Fritz", "Male", "077 392 74 19", "2017", "133");
    }
}
