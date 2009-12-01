/**
 *  Copyright (C) 2009 ShoddyTCG Developer Team
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *  
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.shoddytcg.server.backend.entity;


/**
 * @author Nushio
 *
 */
public class TrainerCard extends CardType{
	public enum Type { TRAINER, TOOL, TM, POKEMON, FOSSIL}
	
	private Type type;
	private String Text;
	private String hp="0";

	/**
	 * @return the hp
	 */
	public String getHP() {
		return hp;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHP(String hp) {
		this.hp = hp;
	}

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return Text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		Text = text;
	}
	
	public static Type returnType(String type){
		try{
			if(type.equalsIgnoreCase("Tool"))
				return Type.TOOL;
			else if(type.equalsIgnoreCase("TM"))
				return Type.TM;
			else if(type.equalsIgnoreCase("Pokemon"))
				return Type.POKEMON;
			else 
				return Type.TRAINER;
		}catch(Exception e){
			return Type.TRAINER;
		}
	}
}
