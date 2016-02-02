package fr.univavignon.courbes.common;

/*
 * Courbes
 * Copyright 2015-16 L3 Info UAPV 2015-16
 * 
 * This file is part of Courbes.
 * 
 * Courbes is free software: you can redistribute it and/or modify it under the terms 
 * of the GNU General Public License as published by the Free Software Foundation, 
 * either version 2 of the License, or (at your option) any later version.
 * 
 * Courbes is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR 
 * PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Courbes. If not, see <http://www.gnu.org/licenses/>.
 */

import java.io.Serializable;

/**
 * Représente un joueur, non pas dans le cadre général du jeu comme {@link Profile}, 
 * mais dans celui d'une partie. La classe contient le profil associé au joueur, mais
 * aussi le score courant du joueur dans la partie.
 */
public class Player implements Serializable
{	/** Numéro de série (pour {@code Serializable}) */
	private static final long serialVersionUID = 1L;
	
	/** Profil du joueur dans le jeu, en général */
	public Profile profile;
	/** Numéro unique du joueur dans la partie en cours */
	public int playerId;

	/** Score total du joueur dans la partie courante, <i>avant</i> la manche courante */
	public int totalScore;
	/** Score partiel du joueur pour la manche courante */
	public int roundScore;
	/** Classement du joueur dans la partie courante */
	public int currentRank;
}