package br.ufpe.cin.if998;

import com.cdyne.ws.IP2Geo;
import com.cdyne.ws.IP2GeoSoap;

public class WSConsumer {
	public static void main (String args[]) {
		IP2Geo ipService = new IP2Geo();
		IP2GeoSoap ip2Geo = ipService.getIP2GeoSoap();
		System.out.println(ip2Geo.resolveIP("8.8.8.8", "0"));
	}
}
