package Chapter12SearchingAndSorting;

import java.util.*;

public class PokeDex {
    List<Pokemon> dex;

    public void initializePokedex() {
        dex.add(new Pokemon(1, "Bulbasaur", "Green", 70, 1));
        dex.add(new Pokemon(2, "Ivysaur", "Green", 100, 2));
        dex.add(new Pokemon(3, "Venusaur", "Green", 200, 3));
        dex.add(new Pokemon(4, "Charmander", "Red", 60, 1));
        dex.add(new Pokemon(5, "Charmeleon", "Red", 110, 2));
        dex.add(new Pokemon(6, "Charizard", "Red", 170, 3));
        dex.add(new Pokemon(7, "Squirtle", "Blue", 50, 1));
        dex.add(new Pokemon(8, "Wartortle", "Blue", 100, 2));
        dex.add(new Pokemon(9, "Blastoise", "Blue", 160, 3));
        dex.add(new Pokemon(10, "Caterpie", "Green", 30,1));
        dex.add(new Pokemon(11, "Metapod",  "Green", 70,2));
        dex.add(new Pokemon(12, "Butterfree", "Purple", 110,3));
        dex.add(new Pokemon(13, "Weedle",  "Yellow", 30,1));
        dex.add(new Pokemon(14, "Kakuna",  "Yellow", 60,2));
        dex.add(new Pokemon(15, "Beedrill",  "Yellow", 100,3));
        dex.add(new Pokemon(16, "Pidgey",  "Brown", 30,1));
        dex.add(new Pokemon(17, "Pidgeotto",  "Brown", 110,2));
        dex.add(new Pokemon(18, "Pidgeot", "Brown", 150,3));
        dex.add(new Pokemon(19, "Rattata", "Purple", 30,1));
        dex.add(new Pokemon(20, "Raticate", "Brown", 70,2));
        dex.add(new Pokemon(21, "Spearow","Brown", 30,1));
        dex.add(new Pokemon(22, "Fearow", "Brown", 120,2));
        dex.add(new Pokemon(23, "Ekans", "Purple", 200,1));
        dex.add(new Pokemon(24, "Arbok",  "Purple", 350,2));
        dex.add(new Pokemon(25, "Pikachu","Yellow", 40,1));
        dex.add(new Pokemon(26, "Raichu",  "Orange", 80,2));
        dex.add(new Pokemon(27, "Sandshrew","Yellow", 60,1));
        dex.add(new Pokemon(28, "Sandslash","Yellow", 100,2));
        dex.add(new Pokemon(29, "Nidoran F", "Blue", 40,1));
        dex.add(new Pokemon(30, "Nidorina","Blue", 80,2));
        dex.add(new Pokemon(31, "Nidoqueen", "Blue", 130,3));
        dex.add(new Pokemon(32, "Nidoran M","Purple", 50,1));
        dex.add(new Pokemon(33, "Nidorino",  "Purple", 90,2));
        dex.add(new Pokemon(34, "Nidoking", "Purple", 140,3));
        dex.add(new Pokemon(35, "Clefairy",  "Pink", 60,1));
        dex.add(new Pokemon(36, "Clefable", "Pink", 130,2));
        dex.add(new Pokemon(37, "Vulpix", "Brown", 60,1));
        dex.add(new Pokemon(38, "Ninetales","Yellow", 110,2));
        dex.add(new Pokemon(39, "Jigglypuff", "Pink", 50,1));
        dex.add(new Pokemon(40, "Wigglytuff", "Pink", 100,2));
        dex.add(new Pokemon(41, "Zubat", "Purple", 80,1));
        dex.add(new Pokemon(42, "Golbat","Purple", 160,2));
        dex.add(new Pokemon(43, "Oddish","Blue", 50,1));
        dex.add(new Pokemon(44, "Gloom", "Blue", 80,2));
        dex.add(new Pokemon(45, "Vileplume", "Red", 120,3));
        dex.add(new Pokemon(46, "Paras", "Orange", 30,1));
        dex.add(new Pokemon(47, "Parasect","Orange", 100,2));
        dex.add(new Pokemon(48, "Venonat", "Purple", 100,1));
        dex.add(new Pokemon(49, "Venomoth",  "Purple", 150,2));
        dex.add(new Pokemon(50, "Diglett", "Brown", 20,1));
        dex.add(new Pokemon(51, "Dugtrio", "Brown", 70,2));
        dex.add(new Pokemon(52, "Meowth", "Yellow", 40,1));
        dex.add(new Pokemon(53, "Persian", "Yellow", 100,2));
        dex.add(new Pokemon(54, "Psyduck", "Yellow", 80,1));
        dex.add(new Pokemon(55, "Golduck","Blue", 170,2));
        dex.add(new Pokemon(56, "Mankey", "Brown", 50,1));
        dex.add(new Pokemon(57, "Primeape",  "Brown", 100,2));
        dex.add(new Pokemon(58, "Growlithe",  "Orange", 70,1));
        dex.add(new Pokemon(59, "Arcanine","Orange", 190,2));
        dex.add(new Pokemon(60, "Poliwag", "Blue", 60,1));
        dex.add(new Pokemon(61, "Poliwhirl", "Blue", 100,2));
        dex.add(new Pokemon(62, "Poliwrath",  "Blue", 130,3));
        dex.add(new Pokemon(63, "Abra", "Yellow", 90,1));
        dex.add(new Pokemon(64, "Kadabra",  "Yellow", 130,2));
        dex.add(new Pokemon(65, "Alakazam", "Yellow", 150,0));
        dex.add(new Pokemon(66, "Machop",  "Gray", 80,1));
        dex.add(new Pokemon(67, "Machoke",  "Gray", 150,2));
        dex.add(new Pokemon(68, "Machamp", "Gray", 160,3));
        dex.add(new Pokemon(69, "Bellsprout", "Yellow", 70,1));
        dex.add(new Pokemon(70, "Weepinbell","Green", 100,2));
        dex.add(new Pokemon(71, "Victreebel",  "Green", 170,0));
        dex.add(new Pokemon(72, "Tentacool", "Blue", 90,1));
        dex.add(new Pokemon(73, "Tentacruel", "Purple", 160,2));
        dex.add(new Pokemon(74, "Geodude", "Gray", 40,1));
        dex.add(new Pokemon(75, "Graveler", "Gray", 100,2));
        dex.add(new Pokemon(76, "Golem", "Brown", 140,3));
        dex.add(new Pokemon(77, "Ponyta", "Orange", 80,1));
        dex.add(new Pokemon(78, "Rapidash", "Orange", 170,2));
        dex.add(new Pokemon(79, "Slowpoke", "Pink", 120,1));
        dex.add(new Pokemon(80, "Slowbro", "Pink", 160,2));
        dex.add(new Pokemon(81, "Magnemite", "Gray", 30,1));
        dex.add(new Pokemon(82, "Magneton", "Gray", 100,2));
        dex.add(new Pokemon(83, "Farfetch'd", "Brown", 60,1));
        dex.add(new Pokemon(84, "Doduo",  "Brown", 140,1));
        dex.add(new Pokemon(85, "Dodrio", "Brown", 180,2));
        dex.add(new Pokemon(86, "Seel", "White", 110,1));
        dex.add(new Pokemon(87, "Dewgong", "White", 170,2));
        dex.add(new Pokemon(88, "Grimer", "Purple", 90,1));
        dex.add(new Pokemon(89, "Muk","Purple", 120,2));
        dex.add(new Pokemon(90, "Shellder", "Purple", 30,1));
        dex.add(new Pokemon(91, "Cloyster", "Purple", 150,2));
        dex.add(new Pokemon(92, "Gastly", "Purple", 130,1));
        dex.add(new Pokemon(93, "Haunter", "Purple", 160,2));
        dex.add(new Pokemon(94, "Gengar", "Purple", 150,3));
        dex.add(new Pokemon(95, "Onix","Gray", 880,1));
        dex.add(new Pokemon(96, "Drowzee", "Yellow", 60,1));
        dex.add(new Pokemon(97, "Hypno", "Yellow", 160,2));
        dex.add(new Pokemon(98, "Krabby", "Red", 40,1));
        dex.add(new Pokemon(99, "Kingler","Red", 130,2));
        dex.add(new Pokemon(100, "Voltrob","Red", 50,1));
        dex.add(new Pokemon(101, "Electrode","Red", 120,2));
        dex.add(new Pokemon(102, "Exeggcute", "Green", 40,1));
        dex.add(new Pokemon(103, "Exeggutor", "Yellow", 200,2));
        dex.add(new Pokemon(104, "Cubone", "Brown", 40,1));
        dex.add(new Pokemon(105, "Marowak",  "Brown", 100,2));
        dex.add(new Pokemon(106, "Hitmonlee",  "Brown", 150,1));
        dex.add(new Pokemon(107, "Hitmonchan",  "Brown", 140,1));
        dex.add(new Pokemon(108, "Lickitung", "Pink", 120,1));
        dex.add(new Pokemon(109, "Koffing", "Purple", 60,1));
        dex.add(new Pokemon(110, "Weezing",  "Purple", 120,2));
        dex.add(new Pokemon(111, "Rhyhorn",  "Gray", 80,1));
        dex.add(new Pokemon(112, "Rhydon",  "Gray", 100,2));
        dex.add(new Pokemon(113, "Chansey","Pink", 110,1));
        dex.add(new Pokemon(114, "Tangela", "Blue", 100,1));
        dex.add(new Pokemon(115, "Kangaskhan", "Brown", 220,1));
        dex.add(new Pokemon(116, "Horsea", "Blue", 40,1));
        dex.add(new Pokemon(117, "Seadra",  "Blue", 120,2));
        dex.add(new Pokemon(118, "Goldeen",  "Orange", 60,1));
        dex.add(new Pokemon(119, "Seaking","Orange", 130,2));
        dex.add(new Pokemon(120, "Staryu","Red", 80,1));
        dex.add(new Pokemon(121, "Starmie", "Purple", 110,2));
        dex.add(new Pokemon(122, "Mr. Mime", "Pink", 130,1));
        dex.add(new Pokemon(123, "Scyther", "Green", 150,1));
        dex.add(new Pokemon(124, "Jynx", "Purple", 140,1));
        dex.add(new Pokemon(125, "Electabuzz","Yellow", 110,1));
        dex.add(new Pokemon(126, "Magmar", "Red", 130,1));
        dex.add(new Pokemon(127, "Pinsir","Green", 150,1));
        dex.add(new Pokemon(128, "Tauros","Brown", 140,1));
        dex.add(new Pokemon(129, "Magikarp", "Orange", 90,1));
        dex.add(new Pokemon(130, "Gyarados",  "Blue", 650,2));
        dex.add(new Pokemon(131, "Lapras", "Blue", 250,1));
        dex.add(new Pokemon(132, "Ditto", "Purple", 30,1));
        dex.add(new Pokemon(133, "Eevee", "Brown", 30,1));
        dex.add(new Pokemon(134, "Vaporeon", "Blue", 100,2));
        dex.add(new Pokemon(135, "Jolteon",  "Yellow", 80,2));
        dex.add(new Pokemon(136, "Flareon", "Orange", 90,2));
        dex.add(new Pokemon(137, "Porygon", "Red", 80,1));
        dex.add(new Pokemon(138, "Omanyte", "Blue", 40,1));
        dex.add(new Pokemon(139, "Omastar", "Blue", 100,2));
        dex.add(new Pokemon(140, "Kabuto", "Orange", 50,1));
        dex.add(new Pokemon(141, "Kabutops", "Orange", 130,2));
        dex.add(new Pokemon(142, "Aerodactyl", "Gray", 180,1));
        dex.add(new Pokemon(143, "Snorlax", "Blue", 210,1));
        dex.add(new Pokemon(144, "Articuno", "Blue", 170,1));
        dex.add(new Pokemon(145, "Zapdos", "Yellow", 160,1));
        dex.add(new Pokemon(146, "Moltres", "Fire", 200,1));
        dex.add(new Pokemon(147, "Dratini", "Blue", 180,1));
        dex.add(new Pokemon(148, "Dragonair", "Blue", 400,2));
        dex.add(new Pokemon(149, "Dragonite", "Orange", 220,0));
        dex.add(new Pokemon(150, "Mewtwo", "Purple", 200,1));
        dex.add(new Pokemon(151, "Mew", "Purple", 40,1));
    }

    public Pokemon remove() {
        return dex.remove(dex.size() - 1);
    }

    public String toString() {
        String result = "[";
        for (Pokemon pokemon : dex) {
            result += pokemon.name + ",";
        }
        return result + "]";
    }

    public void sort() {
        Collections.sort(dex);
    }

    public PokeDex() {
        dex = new ArrayList<>();
        initializePokedex();
    }
}
