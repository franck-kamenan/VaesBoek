package be.intecbrussel.hoofdstuk12;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ClassWrapper {

    public static void main(String[] args) {

        Byte aByteObject;
        Short aShortObject;
        Integer integerObject;
        Long aLongObject;
        Float aFloatObject;
        Double aDoubleObject;
        BigInteger bigIntegerObject;
        BigDecimal bigDecimalObject;
        Boolean aBooleanObject;
        Character characterObject;

        Integer intObject = Integer.valueOf(5);
        System.out.println(intObject);
        int intPrimitive = intObject.intValue();
        System.out.println(intPrimitive);
        Integer secondIntObject = Integer.valueOf(intPrimitive);
        System.out.println(secondIntObject);
        int secondIntPrimitive = secondIntObject.intValue();
        System.out.println(secondIntPrimitive);
    }
}
