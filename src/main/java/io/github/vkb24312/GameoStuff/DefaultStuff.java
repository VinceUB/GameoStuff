package io.github.vkb24312.GameoStuff;

import java.awt.*;

public class DefaultStuff {
    public static String[] surnames = {"SMITH", "JOHNSON", "WILLIAMS", "BROWN", "JONES", "GARCIA", "MILLER", "DAVIS", "RODRIGUEZ", "MARTINEZ", "HERNANDEZ", "LOPEZ", "GONZALEZ", "WILSON", "ANDERSON", "THOMAS", "TAYLOR", "MOORE", "JACKSON", "MARTIN", "LEE", "PEREZ", "THOMPSON", "WHITE", "HARRIS", "SANCHEZ", "CLARK", "RAMIREZ", "LEWIS", "ROBINSON", "WALKER", "YOUNG", "ALLEN", "KING", "WRIGHT", "SCOTT", "TORRES", "NGUYEN", "HILL", "FLORES", "GREEN", "ADAMS", "NELSON", "BAKER", "HALL", "RIVERA", "CAMPBELL", "MITCHELL", "CARTER", "ROBERTS", "GOMEZ", "PHILLIPS", "EVANS", "TURNER", "DIAZ", "PARKER", "CRUZ", "EDWARDS", "COLLINS", "REYES", "STEWART", "MORRIS", "MORALES", "MURPHY", "COOK", "ROGERS", "GUTIERREZ", "ORTIZ", "MORGAN", "COOPER", "PETERSON", "BAILEY", "REED", "KELLY", "HOWARD", "RAMOS", "KIM", "COX", "WARD", "RICHARDSON", "WATSON", "BROOKS", "CHAVEZ", "WOOD", "JAMES", "BENNETT", "GRAY", "MENDOZA", "RUIZ", "HUGHES", "PRICE", "ALVAREZ", "CASTILLO", "SANDERS", "PATEL", "MYERS", "LONG", "ROSS", "FOSTER", "JIMENEZ", "POWELL", "JENKINS", "PERRY", "RUSSELL", "SULLIVAN", "BELL", "COLEMAN", "BUTLER", "HENDERSON", "BARNES", "GONZALES", "FISHER", "VASQUEZ", "SIMMONS", "ROMERO", "JORDAN", "PATTERSON", "ALEXANDER", "HAMILTON", "GRAHAM", "REYNOLDS", "GRIFFIN", "WALLACE", "MORENO", "WEST", "COLE", "HAYES", "BRYANT", "HERRERA", "GIBSON", "ELLIS", "TRAN", "MEDINA", "AGUILAR", "STEVENS", "MURRAY", "FORD", "CASTRO", "MARSHALL", "OWENS", "HARRISON", "FERNANDEZ", "MCDONALD", "WOODS", "WASHINGTON", "KENNEDY", "WELLS", "VARGAS", "HENRY", "CHEN", "FREEMAN", "WEBB", "TUCKER", "GUZMAN", "BURNS", "CRAWFORD", "OLSON", "SIMPSON", "PORTER", "HUNTER", "GORDON", "MENDEZ", "SILVA", "SHAW", "SNYDER", "MASON", "DIXON", "MUNOZ", "HUNT", "HICKS", "HOLMES", "PALMER", "WAGNER", "BLACK", "ROBERTSON", "BOYD", "ROSE", "STONE", "SALAZAR", "FOX", "WARREN", "MILLS", "MEYER", "RICE", "SCHMIDT", "GARZA", "DANIELS", "FERGUSON", "NICHOLS", "STEPHENS", "SOTO", "WEAVER", "RYAN", "GARDNER", "PAYNE", "GRANT", "DUNN", "KELLEY", "SPENCER", "HAWKINS", "ARNOLD", "PIERCE", "VAZQUEZ", "HANSEN", "PETERS", "SANTOS", "HART", "BRADLEY", "KNIGHT", "ELLIOTT", "CUNNINGHAM", "DUNCAN", "ARMSTRONG", "HUDSON", "CARROLL", "LANE", "RILEY", "ANDREWS", "ALVARADO", "RAY", "DELGADO", "BERRY", "PERKINS", "HOFFMAN", "JOHNSTON", "MATTHEWS", "PENA", "RICHARDS", "CONTRERAS", "WILLIS", "CARPENTER", "LAWRENCE", "SANDOVAL", "GUERRERO", "GEORGE", "CHAPMAN", "RIOS", "ESTRADA", "ORTEGA", "WATKINS", "GREENE", "NUNEZ", "WHEELER", "VALDEZ", "HARPER", "BURKE", "LARSON", "SANTIAGO", "MALDONADO", "MORRISON", "FRANKLIN", "CARLSON", "AUSTIN", "DOMINGUEZ", "CARR", "LAWSON", "JACOBS", "OBRIEN", "LYNCH", "SINGH", "VEGA", "BISHOP", "MONTGOMERY", "OLIVER", "JENSEN", "HARVEY", "WILLIAMSON", "GILBERT", "DEAN", "SIMS", "ESPINOZA", "HOWELL", "LI", "WONG", "REID", "HANSON", "LE", "MCCOY", "GARRETT", "BURTON", "FULLER", "WANG", "WEBER", "WELCH", "ROJAS", "LUCAS", "MARQUEZ", "FIELDS", "PARK", "YANG", "LITTLE", "BANKS", "PADILLA", "DAY", "WALSH", "BOWMAN", "SCHULTZ", "LUNA", "FOWLER", "MEJIA", "DAVIDSON", "ACOSTA", "BREWER", "MAY", "HOLLAND", "JUAREZ", "NEWMAN", "PEARSON", "CURTIS", "CORTEZ", "DOUGLAS", "SCHNEIDER", "JOSEPH", "BARRETT", "NAVARRO", "FIGUEROA", "KELLER", "AVILA", "WADE", "MOLINA", "STANLEY", "HOPKINS", "CAMPOS", "BARNETT", "BATES", "CHAMBERS", "CALDWELL", "BECK", "LAMBERT", "MIRANDA", "BYRD", "CRAIG", "AYALA", "LOWE", "FRAZIER", "POWERS", "NEAL", "LEONARD", "GREGORY", "CARRILLO", "SUTTON", "FLEMING", "RHODES", "SHELTON", "SCHWARTZ", "NORRIS", "JENNINGS", "WATTS", "DURAN", "WALTERS", "COHEN", "MCDANIEL", "MORAN", "PARKS", "STEELE", "VAUGHN", "BECKER", "HOLT", "DELEON", "BARKER", "TERRY", "HALE", "LEON", "HAIL", "BENSON", "HAYNES", "HORTON", "MILES", "LYONS", "PHAM", "GRAVES", "BUSH", "THORNTON", "WOLFE", "WARNER", "CABRERA", "MCKINNEY", "MANN", "ZIMMERMAN", "DAWSON", "LARA", "FLETCHER", "PAGE", "MCCARTHY", "LOVE", "ROBLES", "CERVANTES", "SOLIS", "ERICKSON", "REEVES", "CHANG", "KLEIN", "SALINAS", "FUENTES", "BALDWIN", "DANIEL", "SIMON", "VELASQUEZ", "HARDY", "HIGGINS", "AGUIRRE", "LIN", "CUMMINGS", "CHANDLER", "SHARP", "BARBER", "BOWEN", "OCHOA", "DENNIS", "ROBBINS", "LIU", "RAMSEY", "FRANCIS", "GRIFFITH", "PAUL", "BLAIR", "OCONNOR", "CARDENAS", "PACHECO", "CROSS", "CALDERON", "QUINN", "MOSS", "SWANSON", "CHAN", "RIVAS", "KHAN", "RODGERS", "SERRANO", "FITZGERALD", "ROSALES", "STEVENSON", "CHRISTENSEN", "MANNING", "GILL", "CURRY", "MCLAUGHLIN", "HARMON", "MCGEE", "GROSS", "DOYLE", "GARNER", "NEWTON", "BURGESS", "REESE", "WALTON", "BLAKE", "TRUJILLO", "ADKINS", "BRADY", "GOODMAN", "ROMAN", "WEBSTER", "GOODWIN", "FISCHER", "HUANG", "POTTER", "DELACRUZ", "MONTOYA", "TODD", "WU", "HINES", "MULLINS", "CASTANEDA", "MALONE", "CANNON", "TATE", "MACK", "SHERMAN", "HUBBARD", "HODGES", "ZHANG", "GUERRA", "WOLF", "VALENCIA", "SAUNDERS", "FRANCO", "ROWE", "GALLAGHER", "FARMER", "HAMMOND", "HAMPTON", "TOWNSEND", "INGRAM", "WISE", "GALLEGOS", "CLARKE", "BARTON", "SCHROEDER", "MAXWELL", "WATERS", "LOGAN", "CAMACHO", "STRICKLAND", "NORMAN", "PERSON", "COLON", "PARSONS", "FRANK", "HARRINGTON", "GLOVER", "OSBORNE", "BUCHANAN", "CASEY", "FLOYD", "PATTON", "IBARRA", "BALL", "TYLER", "SUAREZ", "BOWERS", "OROZCO", "SALAS", "COBB", "GIBBS", "ANDRADE", "BAUER", "CONNER", "MOODY", "ESCOBAR", "MCGUIRE", "LLOYD", "MUELLER", "HARTMAN", "FRENCH", "KRAMER", "MCBRIDE", "POPE", "LINDSEY", "VELAZQUEZ", "NORTON", "MCCORMICK", "SPARKS", "FLYNN", "YATES", "HOGAN", "MARSH", "MACIAS", "VILLANUEVA", "ZAMORA", "PRATT", "STOKES", "OWEN", "BALLARD", "LANG", "BROCK", "VILLARREAL", "CHARLES", "DRAKE", "BARRERA", "CAIN", "PATRICK", "PINEDA", "BURNETT", "MERCADO", "SANTANA", "SHEPHERD", "BAUTISTA", "ALI", "SHAFFER", "LAMB", "TREVINO", "MCKENZIE", "HESS", "BEIL", "OLSEN", "COCHRAN", "MORTON", "NASH", "WILKINS", "PETERSEN", "BRIGGS", "SHAH", "ROTH", "NICHOLSON", "HOLLOWAY", "LOZANO", "RANGEL", "FLOWERS", "HOOVER", "SHORT", "ARIAS", "MORA", "VALENZUELA", "BRYAN", "MEYERS", "WEISS", "UNDERWOOD", "BASS", "GREER", "SUMMERS", "HOUSTON", "CARSON", "MORROW", "CLAYTON", "WHITAKER", "DECKER", "YODER", "COLLIER", "ZUNIGA", "CAREY", "WILCOX", "MELENDEZ", "POOLE", "ROBERSON", "LARSEN", "CONLEY", "DAVENPORT", "COPELAND", "MASSEY", "LAM", "HUFF", "ROCHA", "CAMERON", "JEFFERSON", "HOOD", "MONROE", "ANTHONY", "PITTMAN", "HUYNH", "RANDALL", "SINGLETON", "KIRK", "COMBS", "MATHIS", "CHRISTIAN", "SKINNER", "BRADFORD", "RICHARD", "GALVAN", "WALL", "BOONE", "KIRBY", "WILKINSON", "BRIDGES", "BRUCE", "ATKINSON", "VELEZ", "MEZA", "ROY", "VINCENT", "YORK", "HODGE", "VILLA", "ABBOTT", "ALLISON", "TAPIA", "GATES", "CHASE", "SOSA", "SWEENEY", "FARRELL", "WYATT", "DALTON", "HORN", "BARRON", "PHELPS", "YU", "DICKERSON", "HEATH", "FOLEY", "ATKINS", "MATHEWS", "BONILLA", "ACEVEDO", "BENITEZ", "ZAVALA", "HENSLEY", "GLENN", "CISNEROS", "HARRELL", "SHIELDS", "RUBIO", "HUFFMAN", "CHOI", "BOYER", "GARRISON", "ARROYO", "BOND", "KANE", "HANCOCK", "CALLAHAN", "DILLON", "CLINE", "WIGGINS", "GRIMES", "ARELLANO", "MELTON", "ONEILL", "SAVAGE", "HO", "BELTRAN", "PITTS", "PARRISH", "PONCE", "RICH", "BOOTH", "KOCH", "GOLDEN", "WARE", "BRENNAN", "MCDOWELL", "MARKS", "CANTU", "HUMPHREY", "BAXTER", "SAWYER", "CLAY", "TANNER", "HUTCHINSON", "KAUR", "BERG", "WILEY", "GILMORE", "RUSSO", "VILLEGAS", "HOBBS", "KEITH", "WILKERSON", "AHMED", "BEARD", "MCCLAIN", "MONTES", "MATA", "ROSARIO", "VANG", "WALTER", "HENSON", "ONEAL", "MOSLEY", "MCCLURE", "BEASLEY", "STEPHENSON", "SNOW", "HUERTA", "PRESTON", "VANCE", "BARRY", "JOHNS", "EATON", "BLACKWELL", "DYER", "PRINCE", "MACDONALD", "SOLOMON", "GUEVARA", "STAFFORD", "ENGLISH", "HURST", "WOODARD", "CORTES", "SHANNON", "KEMP", "NOLAN", "MCCULLOUGH", "MERRITT", "MURILLO", "MOON", "SALGADO", "STRONG", "KLINE", "CORDOVA", "BARAJAS", "ROACH", "ROSAS", "WINTERS", "JACOBSON", "LESTER", "KNOX", "BULLOCK", "KERR", "LEACH", "MEADOWS", "ORR", "DAVILA", "WHITEHEAD", "PRUITT", "KENT", "CONWAY", "MCKEE", "BARR", "DAVID", "DEJESUS", "MARIN", "BERGER", "MCINTYRE", "BLANKENSHIP", "GAINES", "PALACIOS", "CUEVAS", "BARTLETT", "DURHAM", "DORSEY", "MCCALL", "ODONNELL", "STEIN", "BROWNING", "STOUT", "LOWERY", "SLOAN", "MCLEAN", "HENDRICKS", "CALHOUN", "SEXTON", "CHUNG", "GENTRY", "HULL", "DUARTE", "ELLISON", "NIELSEN", "GILLESPIE", "BUCK", "MIDDLETON", "SELLERS", "LEBLANC", "ESPARZA", "HARDIN", "BRADSHAW", "MCINTOSH", "HOWE", "LIVINGSTON", "FROST", "GLASS", "MORSE", "KNAPP", "HERMAN", "STARK", "BRAVO", "NOBLE", "SPEARS", "WEEKS", "CORONA", "FREDERICK", "BUCKLEY", "MCFARLAND", "HEBERT", "ENRIQUEZ", "HICKMAN", "QUINTERO", "RANDOLPH", "SCHAEFER", "WALLS", "TREJO", "HOUSE", "REILLY", "PENNINGTON", "MICHAEL", "CONRAD", "GILES", "BENJAMIN", "CROSBY", "FITZPATRICK", "DONOVAN", "MAYS", "MAHONEY", "VALENTINE", "RAYMOND", "MEDRANO", "HAHN", "MCMILLAN", "SMALL", "BENTLEY", "FELIX", "PECK", "LUCERO", "BOYLE", "HANNA", "PACE", "RUSH", "HURLEY", "HARDING", "MCCONNELL", "BERNAL", "NAVA", "AYERS", "EVERETT", "VENTURA", "AVERY", "PUGH", "MAYER", "BENDER", "SHEPARD", "MCMAHON", "LANDRY", "CASE", "SAMPSON", "MOSES", "MAGANA", "BLACKBURN", "DUNLAP", "GOULD", "DUFFY", "VAUGHAN", "HERRING", "MCKAY", "ESPINOSA", "RIVERS", "FARLEY", "BERNARD", "ASHLEY", "FRIEDMAN", "POTTS", "TRUONG", "COSTA", "CORREA", "BLEVINS", "NIXON", "CLEMENTS", "FRY", "DELAROSA", "BEST", "BENTON", "LUGO", "PORTILLO", "DOUGHERTY", "CRANE", "HALEY", "PHAN", "VILLALOBOS", "BLANCHARD", "HORNE", "FINLEY", "QUINTANA", "LYNN", "ESQUIVEL", "BEAN", "DODSON", "MULLEN", "XIONG", "HAYDEN", "CANO", "LEVY", "HUBER", "RICHMOND", "MOYER", "LIM", "FRYE", "SHEPPARD", "MCCARTY", "AVALOS", "BOOKER", "WALLER", "PARRA", "WOODWARD", "JARAMILLO", "KRUEGER", "RASMUSSEN", "BRANDT", "PERALTA", "DONALDSON", "STUART", "FAULKNER", "MAYNARD", "GALINDO", "COFFEY", "ESTES", "SANFORD", "BURCH", "MADDOX", "VO", "OCONNELL", "VU", "ANDERSEN", "SPENCE", "MCPHERSON", "CHURCH", "SCHMITT", "STANTON", "LEAL", "CHERRY", "COMPTON", "DUDLEY", "SIERRA", "POLLARD", "ALFARO", "HESTER", "PROCTOR", "LU", "HINTON", "NOVAK", "GOOD", "MADDEN", "MCCANN", "TERRELL", "JARVIS", "DICKSON", "REYNA", "CANTRELL", "MAYO", "BRANCH", "HENDRIX", "ROLLINS", "ROWLAND", "WHITNEY", "DUKE", "ODOM", "DAUGHERTY", "TRAVIS", "TANG", "ARCHER"};
    public static Dimension defaultDimension = new Dimension(300, 300);

    public static String firstCapital(String string){
        char[] charArray = string.toCharArray();
        string = java.lang.Character.toString(charArray[0]).toUpperCase();
        for (int i = 1; i < charArray.length; i++) {
            string = string + java.lang.Character.toString(charArray[i]).toLowerCase();
        }
        return string;
    }
}