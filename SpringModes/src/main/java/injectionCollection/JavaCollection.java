package injectionCollection;

import java.util.*;

import org.springframework.beans.factory.annotation.Required;

public class JavaCollection {
	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;

	public List getAddressList() {
		System.out.println("List Elements :" + addressList);
		return addressList;
	}
	@Required
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	public Set getAddressSet() {
		System.out.println("List Elements :" + addressSet);
		return addressSet;
	}
	@Required
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	public Map getAddressMap() {
		System.out.println("List Elements :" + addressMap);
		return addressMap;
	}
	@Required
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	public Properties getAddressProp() {
		System.out.println("List Elements :" + addressProp);
		return addressProp;
	}
	@Required
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}
	

}