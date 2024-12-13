package Uebungsblatt4.aufgabe2.MVCExampleIncomplete.controller;

import Uebungsblatt4.aufgabe2.MVCExampleIncomplete.model.Role;

public class RoleChecker {

	public static boolean isAuthorized(Role[]ModelRoles, Role userRole) {
		for(Role role : ModelRoles) {
			if(role.name().equalsIgnoreCase(userRole.name())) {
				return true;
			}
		}
		return false;
	}
	
}
