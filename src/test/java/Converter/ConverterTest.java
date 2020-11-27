package Converter;

import org.junit.Test;

public class ConverterTest {
    @Test
    public void test(){

        Converter<MembershipDto,Membership> membershipConverter =
                new MembershipConverter();
        MembershipDto membershipDto =
                new MembershipDto(
                        "Jiajie",
                        "Li",
                        true,
                        "1750655@tongji.edu.cn");

        System.out.println("ConverterTest:");
        System.out.println("\t"+membershipDto.toString());
        System.out.println("\n\tConvert it into a entity.\n");
        Membership membership =
                membershipConverter.convertFromDto(membershipDto);
        System.out.println("\t"+membership.toString());
        System.out.println("ConverterTest Exit");
    }
}
