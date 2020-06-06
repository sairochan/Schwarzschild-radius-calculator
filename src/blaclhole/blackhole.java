package blaclhole;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class blackhole {
	
	BigDecimal massofbh=new BigDecimal(1.987* Math.pow(10, 30)*2.6*Math.pow(10, 9));
	BigDecimal G=new BigDecimal(6.674*Math.pow(10, -11));
	BigDecimal c=new BigDecimal(299792458);
	BigDecimal rs= ((G.multiply(massofbh).multiply(new BigDecimal(2))).divide(c.multiply(c),50,RoundingMode.HALF_UP));
	BigDecimal photonSphere=rs.multiply(new BigDecimal(1.5));
	BigDecimal accretionDisk=rs.multiply(new BigDecimal(3));
	
	public static void main(String[] args) {
		blackhole bh=new blackhole();
		BigDecimal force=bh.G.multiply((bh.massofbh.multiply(new BigDecimal(1.987*Math.pow(10, 30)))).divide(bh.rs.divide(new BigDecimal(10*Math.pow(10, 10))),100,RoundingMode.HALF_UP).pow(2));
		System.out.println(force);
		
	}
	
}
