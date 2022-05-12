
public class DietasClass extends javax.swing.JFrame {


    public DietasClass() {
        initComponents();
        DietaText.setText("No elegiste dieta");
    }

    public DietasClass(String UserDieta){
        initComponents();
        switch (UserDieta) {
            case "Dieta de 1200 calorias":
                DietaName.setText("Dieta de 1200 calorias");
                DietaText.setText("Día 1:\nDesayuno:\n1 taza ( 250 gramos) de queso cottage sin grasa.\n80 gramos de fresas con canela\n\nComida:\nEnsalada grande hecha con: \nVerduras de hoja verde (espinacas y lechuga), en las cantidades que quieras.\n80 gramos de verduras mixtas (pimientos, tomates o zanahorias)\n85 gramos de pechuga de pollo a la plancha.\nZumo de limón para aliñar.\n\nMerienda:\n30 gramos de nueces.\n1 manzana fresca\n\nCena:\n100 gramos de salmón a la plancha con limón.\n160 gramos de judías verdes al vapor con ajo.\n150 gramos de arroz integral cocido\nEnsalada de hojas verdes en las cantidades que quieras\n30 gramos de un aderezo para ensaladas.\n\nPostre:\n1 naranja\n \nDÍA 2\nDesayuno:\n1 huevo entero + 4 claras de huevos con salsa de tomate.\n80 gramos de melón.\n\nComida:\nVerduras salteadas con: \n125 gramos de tofu, cortado en cubos.\n80 gramos de floretes de brócoli.\nManojo grande de hojas de espinacas frescas.\n2 cucharaditas de aceite para freír\nSazonar con salsa de soja, ajo, pimienta y jengibre\n\nMerienda:\n60 gramos de hummus\n80 gramos de zanahorias\n\nCena:\nEnsalada de granos con proteína que lleve:\n100 gramos de camarones a la parrilla\n150 gramos de quinoa cocida.\n160 gramos de verduras mixtas picadas (tomates, pimientos, zanahorias, pepino y cebolla)\n2 cucharadas de vinagreta.\nUna taza de verduras de hoja verde.\n\nPostre:\n1 naranja\n\nDÍA 3\nDesayuno:\n250 gramos de yogur natural sin grasa\n1 plátano en rodajas\nEspolvorear con nuez moscada.\n\nComida:\n100 gramos de fletan a la parrilla\n80 gramos de espárragos al vapor con limón.\nEnsalada de verduras mixta\n2 cucharadas para aderezar la ensalada\n\nMerienda:\n125 gramos de queso cottage sin grasa\n80 gramos de verduras crudas picadas\nSazonar son pimienta, eneldo o cebollino seca\n\nCena:\n85 gramos de carne magra a la plancha\n160 gramos de coles de bruselas asadas\n2 cucharadas de aceite de oliva para las coles de bruselas\nRizada al vapor, acelga y espinaca, en cualquier cantidad\n1/2 patata pequeña rociada con jengibre\n\nPostre:\n80 gramos de piña fresca\n\"");
                break;
            case "Dieta de 1400 calorias":
                DietaName.setText("Dieta de 1400 calorias");
                DietaText.setText("Día 1\nDESAYUNO\nUn vaso de leche descremada con dos cucharadas de  granola,  todo endulzado con una cucharadita de miel de abeja. \nMedia taza de garbanzos cocidos con un pan integral. \nUn vaso de jugo de naranja natural o una taza de sandía, melón o piña, lo cual puede ser ingerido como parte del desayuno o a media mañana. \n\nALMUERZO (COMIDA) \nUn filete de lonja de  pescado a la plancha o asado con dos rebanadas de pan integral o dos tortillas. \nCuatro cucharadas de arroz blanco cocido. \nUna fruta a escoger entre manzana, pera o naranja. \n\nCENA\nMedia  taza  de  atún  en  agua  acompañado  de  cinco galletas soda integral. \nUn plátano (macho) cocido. \n\nDía 2\nDESAYUNO\nMedio vaso de leche descremada con una cucharada de  maicena, todo endulzado con una cucharadita de miel de abeja. \n Media taza de frijoles cocidos con un pan integral. \n Un vaso de jugo de naranja natural ó una taza de sandía, melón o piña, lo cual puede ser ingerido como parte del desayuno ó a media mañana. \n\nALMUERZO (COMIDA) \n6 onzas de carne de res a la plancha o asada acompañada de dos rebanadas de pan integral o dos tortillas. \n 1 Taza de sopa de fideos (de sobre) sin verduras. \nUna fruta a escoger entre manzana, pera o naranja. \n\nCENA\nUn  cuarto  de  pechuga  de  pollo  asada  o  a  la  plancha acompañado de una rebanada de pan integral. \nUn plátano (macho) cocido. \n1 yogurt natural (tamaño aproximado de 150 grs). \n\nDía 3\nDESAYUNO\nUn  vaso  de  leche  descremada  con  dos  cucharadas  de  granola. \n2  claras  de  huevo  con  una  rodaja  de  jamón  de  pavo. \nUn pan integral. \nUn  vaso  de  jugo  de  naranja  natural,   el  cual  puede  ser ingerido  como  parte  del desayuno ó a media mañana. \n\nALMUERZO (COMIDA) \nUna  porción  de  pollo  en  sanfaina . \nUna rebanada de pan integral. \nUna  fruta  a  seleccionar  entre  pera,  manzana,  naranja  o durazno. \n\nCENA\nUna porción de bacalao entomatado. \nUna rebanada de pan integral o una tortilla. \nUna taza de sandía, melón o papaya. \n");
                break;
            case "Dieta de 1600 calorias":
                DietaName.setText("Dieta de 1600 calorias");
                DietaText.setText("Día 1\n"
                        + "DESAYUNO\n"
                        + "Un vaso de leche descremada con dos cucharadas de  granola,  todo endulzado con media cucharada de miel de abeja.\n"
                        + "Huevo con jamón,  utilizando  2  claras  de  huevo con  2 rodajas de jamón de pavo.\n"
                        + "1 rodaja de pan integral.\n"
                        + "Un vaso de jugo de naranja natural y una taza de sandía, melón o piña, lo cual puede ser ingerido como parte del desayuno o a media mañana.  \n"
                        + " \n"
                        + "ALMUERZO (COMIDA)\n"
                        + "1 filete de lonja de  pescado a la plancha o asado.\n"
                        + "2 rebanadas de pan integral o 2 tortillas.\n"
                        + "4 cucharadas de arroz blanco cocido.\n"
                        + "1 fruta a escoger entre manzana, durazno o naranja.\n"
                        + "\n"
                        + "CENA\n"
                        + "Una  taza  de  atún  en  agua.\n"
                        + "5 galletas soda integral.\n"
                        + "Media taza de espinaca cocida.\n"
                        + "1 plátano (macho) cocido.\n"
                        + "\n"
                        + "Día 2\n"
                        + "DESAYUNO\n"
                        + "Una  taza de cereal (Corn Flakes)  agregándole  un  vaso de leche descremada.\n"
                        + "1 coctel de frutas, utilizando dos manzanas, una pera  y  una taza  de  melón,   agregándole  2  cucharadas  de  granola  encima.\n"
                        + "Un  vaso  de  jugo  de  naranja  natural,   el  cual  puede  ser ingerido como parte del desayuno o a media mañana.\n"
                        + " \n"
                        + "ALMUERZO (COMIDA)\n"
                        + "6 onzas de carne de res a la plancha o asada.\n"
                        + "Dos rebanadas de pan integral o dos tortillas.\n"
                        + "Un vaso de jugo de naranja natural.\n"
                        + "\n"
                        + "CENA\n"
                        + "Huevos con jamón, utilizando tres claras de huevo mediano  con tres rodajas de jamón de pavo.  \n"
                        + "Una  rebanada  de  pan  integral.\n"
                        + "Una y media taza de espinaca cocida.\n"
                        + "Una fruta a escoger entre manzana, durazno o naranja.\n"
                        + "\n"
                        + "Día 3\n"
                        + "DESAYUNO\n"
                        + "Media taza de cereal (Corn Flakes)  agregándole  un  vaso de leche descremada, endulzado con una cucharadita de miel de abeja.\n"
                        + "Media taza de frijoles cocidos con un pan integral 1 vaso de jugo de naranja natural o una fruta  (manzana, pera o naranja), lo cual puede ser ingerido como parte del desayuno o a media mañana.\n"
                        + " \n"
                        + "ALMUERZO (COMIDA)\n"
                        + "1  pechuga de pollo a la plancha o asada acompañada de dos rebanadas de pan integral o dos tortillas.\n"
                        + "1 taza de sopa de fideos (en sobre), sin verduras.\n"
                        + "1  vaso de jugo de naranja natural.\n"
                        + " \n"
                        + "CENA\n"
                        + "3 claras de huevo mediano con 3 rodajas de jamón de pavo.\n"
                        + "Una rebanada de pan integral.\n"
                        + "2 frutas a escoger entre manzanas, peras o naranjas.");
                break;
            case "Dieta de 1800 calorias":
                DietaName.setText("Dieta de 1800 calorias");
                DietaText.setText("Día 1\n"
                        + "DESAYUNO\n"
                        + "Un  vaso de leche descremada con una cucharada de maicena, todo endulzado con una cucharadita de miel de abeja.\n"
                        + "Media taza de frijoles cocidos con dos panes integrales\n"
                        + "Un  vaso  de  jugo  de  naranja natural y una taza de sandía, melón  o  piña,  lo  cual  puede  ser ingerido como parte del desayuno o a media mañana.  \n"
                        + " \n"
                        + "ALMUERZO (COMIDA)\n"
                        + "6 onzas de carne de res a la plancha o asada acompañada de dos rebanadas de pan integral o dos tortillas.\n"
                        + "2 tazas de sopa de fideos (de sobre) sin verduras.\n"
                        + "Una fruta a escoger entre manzana, pera o naranja.\n"
                        + "\n"
                        + "CENA\n"
                        + "Media  pechuga  de  pollo  asada  o  a  la  plancha.\n"
                        + "Dos rebanadas de pan integral.\n"
                        + "Un plátano (macho) cocido.\n"
                        + "1 yogurt natural (tamaño aproximado de 150 grs).\n"
                        + "\n"
                        + "Día 2\n"
                        + "DESAYUNO\n"
                        + "Media taza de cereal (Corn Flakes)  agregándole  un  vaso de leche descremada, endulzado con una cucharadita de miel de abeja.\n"
                        + "1  coctél  de  frutas utilizando 2 manzanas,  2  peras  y  dos tazas de papaya o melón.\n"
                        + " \n"
                        + "ALMUERZO (COMIDA)\n"
                        + "1   porción  de  pollo almendrado,  acompañado  de  dos rebanadas de pan integral o dos tortillas.\n"
                        + "1 taza de sopa de fideos (en sobre), sin verduras.\n"
                        + "1  fruta  a  seleccionar  entre  pera,  manzana,  naranja  o durazno.\n"
                        + " \n"
                        + "CENA\n"
                        + "1 porción de bacalao entomatado.\n"
                        + "Dos rebanadas de pan integral.\n"
                        + "1  fruta  a  seleccionar  entre  pera,  manzana,  naranja  o durazno.\n"
                        + "\n"
                        + "Día 3\n"
                        + "DESAYUNO\n"
                        + "1  coctél de frutas utilizando 2 manzanas,  2  peras  y dos tazas  de  papaya  o  melón,  agregándole  encima  una cucharadita de granola.\n"
                        + "1  vaso de leche descremada  con  una  cucharada  de granola, todo endulzado con media cucharadita de miel de abeja,  el  cual  puede  ser  ingerido  como parte del desayuno o a media mañana.\n"
                        + " \n"
                        + "ALMUERZO (COMIDA)\n"
                        + "1   porción  de  pollo en sanfaina,  acompañado  de  dos rebanadas de pan integral o dos tortillas.\n"
                        + "1 taza de sopa de fideos (en sobre), sin verduras.\n"
                        + "1  fruta  a  seleccionar  entre  pera,  manzana,  naranja  o durazno.\n"
                        + " \n"
                        + "CENA\n"
                        + "1 porción de Merluza con guisantes.\n"
                        + "2 rebanadas de pan integral.\n"
                        + "2  frutas a seleccionar entre peras,  manzanas,  naranjas  o duraznos.");
                break;
            case "Dieta de 2000 calorias":
                DietaName.setText("Dieta de 2000 calorias");
                DietaText.setText("Día 1\n"
                        + "DESAYUNO\n"
                        + "Un  vaso de leche descremada con dos cucharadas de maicena, todo endulzado con una cucharadita de miel de abeja.\n"
                        + "1 coctel de frutas, utilizando 2 manzanas, 2 peras y 2 tazas de melón, papaya o sandía,  agregándole  2  cucharadas de granola.\n"
                        + " \n"
                        + "ALMUERZO (COMIDA)\n"
                        + "1  porción  de  pollo  en  sanfaina,  acompañado  de  dos rebanadas de pan integral o dos tortillas.\n"
                        + "1 Taza de sopa de fideos (de sobre) sin verduras.\n"
                        + "Dos frutas a escoger entre manzanas, peras, naranjas o duraznos.\n"
                        + " \n"
                        + "CENA\n"
                        + "1 porción de bacalao entomatado.\n"
                        + "Dos rebanadas de pan integral.\n"
                        + "Un plátano (macho) cocido.\n"
                        + "1 yogurt natural (tamaño aproximado de 150 grs).\n"
                        + "\n"
                        + "Día 2 \n"
                        + "DESAYUNO\n"
                        + "Un vaso de leche descremada con cuatro cucharadas de granola, todo endulzado con una cucharadita de miel de abeja.\n"
                        + "Media  taza  de  garbanzos  cocidos. \n"
                        + "Dos  rodajas de pan integral\n"
                        + "Un vaso de jugo de naranja natural y una taza de sandía, melón o piña, lo cual puede ser ingerido como parte del desayuno o a media mañana.  \n"
                        + " \n"
                        + "ALMUERZO (COMIDA)\n"
                        + "Un filete de lonja de  pescado a la plancha o asado.\n"
                        + "Dos rebanadas de pan integral o dos tortillas.\n"
                        + "Cuatro cucharadas de arroz blanco cocido.\n"
                        + "1 taza de sopa de fideos (de sobre), sin verduras.\n"
                        + "Dos frutas a escoger entre manzanas, peras o naranjas.\n"
                        + " \n"
                        + "CENA\n"
                        + "Una  taza  de  atún  en  agua.   \n"
                        + "5  galletas soda integral.\n"
                        + "Una taza de espinaca cocida.\n"
                        + "Un plátano (macho) cocido.\n"
                        + "1 yogurt natural (tamaño aproximado de 150 grs).\n"
                        + "\n"
                        + "Día 3\n"
                        + "DESAYUNO\n"
                        + "Una  taza de cereal (Corn Flakes)  agregándole  un  vaso de leche descremada, endulzado con una cucharadita de miel de abeja.\n"
                        + "Media taza de frijoles cocidos con un pan integral.\n"
                        + "1 vaso de jugo de naranja natural  y  una fruta  (manzana, pera o naranja), lo cual puede ser ingerido como parte del desayuno o a media mañana.\n"
                        + "\n"
                        + "ALMUERZO (COMIDA)\n"
                        + "1  pechuga de pollo a la plancha o asada.\n"
                        + "Dos rebanadas de pan integral o dos tortillas.\n"
                        + "1 taza de sopa de fideos (en sobre), sin verduras.\n"
                        + "1  vaso de jugo de naranja natural\n"
                        + "1 yogurt natural (tamaño aproximado de 150 grs).\n"
                        + " \n"
                        + "CENA\n"
                        + "Huevos con jamón, utilizando 3 claras de huevo mediano con 3 rodajas de jamón de pavo. \n"
                        + "Dos rebanadas de pan integral.\n"
                        + "1 taza y media de espinaca cocida.\n"
                        + "2 frutas a escoger entre manzanas, peras o naranjas.");
                break;
            case "Dieta de 2200 calorias":
                DietaName.setText("Dieta de 2200 calorias");
                DietaText.setText("Día 1\n"
                        + "Desayuno\n"
                        + "1 taza (250 g) de requesón sin grasa\n"
                        + "1 taza (80 g) de fresas\n"
                        + "Canela en polvo\n"
                        + "1 rodaja de pan integral con:\n"
                        + "3 onzas (85 gm) de rebanadas de pavo\n"
                        + "\n"
                        + "Bocadillo\n"
                        + "½ taza (125 g) de yogur de vainilla sin grasa\n"
                        + "\n"
                        + "Almuerzo\n"
                        + "Ensalada grande preparada con:\n"
                        + "Hojas verdes (lechuga, espinaca) – cualquier cantidad\n"
                        + "2 tazas (160 g) de vegetales mixtos cortados (zanahorias, pimientos, tomates)\n"
                        + "6 onzas (170 g) de pechuga de pollo asada\n"
                        + "½ taza (150 g) de frijoles blancos cocinados\n"
                        + "2 cucharadas (30 g) de aderezo para ensaladas bajo en grasa\n"
                        + "1 mandarina\n"
                        + "\n"
                        + "Bocadillo\n"
                        + "1 onza (30 g) de granos de soya\n"
                        + "Zanahorias y trozos de apio\n"
                        + "\n"
                        + "Cena\n"
                        + "8 onzas (200 g) de salmón asado con limón\n"
                        + "2 tazas (160 g) de judías verdes al vapor con ajo\n"
                        + "1 taza (300 g) de arroz integral cocinado\n"
                        + "Ensalada verde grande – cualquier cantidad\n"
                        + "¼ de aguacate mediano para la ensalada\n"
                        + "2 cucharadas (30 g) de aderezo para ensaladas bajo en calorías\n"
                        + "\n"
                        + "Bocadillo\n"
                        + "1 naranja\n"
                        + "\n"
                        + "DÍA 2\n"
                        + "Desayuno\n"
                        + "1 huevo entero y 4 claras de huevo, batidas en un sartén\n"
                        + "Salsa de tomate\n"
                        + "2 tortillas de maíz\n"
                        + "1 taza (250 g) de requesón sin grasa\n"
                        + "1 taza (80 g) de melón cortado\n"
                        + "\n"
                        + "Bocadillo\n"
                        + "½ taza (125 g) de yogur de vainilla sin grasa\n"
                        + "\n"
                        + "Almuerzo\n"
                        + "Pollo y vegetales salteados: mezclar tofu, pollo y vegetales:\n"
                        + "5 onzas (125 g) de tofu firme, cortado en cuadritos\n"
                        + "3 onzas (85 g) de pechuga de pollo cortada en pedazos\n"
                        + "2 tazas (80 g) de brócoli\n"
                        + "Hojas de espinaca fresca\n"
                        + "2 cucharaditas (10 ml) de aceite para freír\n"
                        + "Sazonar con salsa de soya, ajo, pimiento y jengibre\n"
                        + "½ taza (150 g) de arroz integral cocinado\n"
                        + "½ mango mediano\n"
                        + "\n"
                        + "Bocadillo\n"
                        + "4 cucharadas (60 g) de humus preparado\n"
                        + "1 taza (80 g) de zanahorias tiernas\n"
                        + "\n"
                        + "Cena\n"
                        + "Ensalada de granos con proteína. Mezclar:\n"
                        + "8 onzas (200 g) de camarones a la parrilla\n"
                        + "½ taza (150 g) de quínoa cocinada\n"
                        + "2 tazas (160 g) de vegetales mixtos cortados (tomate, pimiento, zanahoria, pepino, cebolla)\n"
                        + "2 cucharadas (30 g) de aderezo de vinagre para ensaladas bajo en caloríasPoner todo en una cama de hojas verdes\n"
                        + "\n"
                        + "Bocadillo\n"
                        + "1 naranja fresca\n"
                        + "\n"
                        + "Día 3\n"
                        + "Desayuno\n"
                        + "1 huevo entero y 4 claras de huevo batidas en un sartén\n"
                        + "½ muffin inglés integral tostado\n"
                        + "1 taza (250 g) de yogurt sin sabor y sin grasa\n"
                        + "1 banana en rodajas\n"
                        + "Espolvorear con nuez moscada\n"
                        + "\n"
                        + "Bocadillo\n"
                        + "1 onza (30 g) de queso mozzarella bajo en grasa\n"
                        + "\n"
                        + "Almuerzo\n"
                        + "8 onzas (200 g) de halibut asado\n"
                        + "2 tazas (80 g) de espárragos cocidos con limón\n"
                        + "½ taza (150 g) de pasta integral\n"
                        + "Ensalada mixta de hojas verdes (cualquier cantidad)\n"
                        + "2 cucharadas (30 g) de aderezo para ensaladas bajo en calorías\n"
                        + "1 taza (80 g) de bayas\n"
                        + "\n"
                        + "Bocadillo\n"
                        + "½ taza (125 g) de requesón sin grasa\n"
                        + "1 taza (80 g) de vegetales crudos y cortados\n"
                        + "Sazonar con sal, pimiento, cebollines secos\n"
                        + "\n"
                        + "Cena\n"
                        + "6 onzas (170 g) de carne a la plancha\n"
                        + "2 tazas (160 g) de coles de Bruselas asadas (cortar por la mitad, mezclar con aceite de oliva, asar a 400 F / 205 º C durante 20 minutos)\n"
                        + "2 cucharaditas (10 ml) de aceite de oliva (para las coles de bruselas)\n"
                        + "Col rizada, espinaca, o acelga al vapor\n"
                        + "½ de una batata pequeña roseada con jengibre\n"
                        + "\n"
                        + "Bocadillo\n"
                        + "1 taza (80 g) de piña fresca");
                break;
            case "Dieta de 2400 calorias":
                DietaName.setText("Dieta de 2400 calorias");
                DietaText.setText("Comida 1 (aproximadamente a las 6 am)\n"
                        + "1 vaso de leche descremada con una taza de corn flakes.\n"
                        + "1 taza de frijoles cocidos.\n"
                        + "2 rebanadas de pan integral.\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Comida 2 (aproximadamente a las 9 am)\n"
                        + "1 vaso de leche descremada con 6 cucharadas de avena\n"
                        + "\n"
                        + "Comida 3 (aproximadamente a la 1 pm)\n"
                        + "1/2 pechuga de pollo asada o a la plancha\n"
                        + "1 taza de arroz cocido\n"
                        + "4 rebanadas de pan integral o 4 tortillas de maíz\n"
                        + "Ensalada fresca al gusto\n"
                        + "Agua a libre demanda\n"
                        + " \n"
                        + "Comida 4 (aproximadamente a las 5 pm)\n"
                        + "1 vaso de leche descremada con 6 cucharadas de avena\n"
                        + "\n"
                        + "Comida 5 (aproximadamente a las 8 pm)\n"
                        + "3/4 taza de atún en agua\n"
                        + "2 rebanadas de pan integral\n"
                        + "1 taza de espinaca cocida\n"
                        + "1 plátano (macho) cocido\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Para variar la comida\n"
                        + "»1 pan integral = 4 galletas soda integral\n"
                        + "»1 taza de corn flakes = 2 cucharadas de maicena o media taza de cualquier cereal que combine hojuelas de maíz con semillas.\n"
                        + "»1 taza de frijoles cocidos = 1 taza de garbanzos cocidos.\n"
                        + "»1/2 pechuga de pollo a la plancha o asada = 6 onzas de carne de res o 1 filete de lonja de pescado, siempre asados o a la plancha.\n"
                        + "»3/4 taza de atún en agua = 5 claras de huevo mediano con 2 rodajas de jamón de pavo.\n"
                        + "»3/4 taza de atún en agua junto con 2 rebanadas de pan integral= 1 sándwich de pollo utilizando dos rodajas de pan integral, 1/4 de pechuga de pollo y ensalada al gusto sin aderezos.\n"
                        + "»1 plátano (macho) cocido = 2 manzanas, 2 peras, 2 naranjas, 6 ciruelas o 20 uvas.");
                break;
            case "Dieta de 2600 calorias":
                DietaName.setText("Dieta de 2600 calorias");
                DietaText.setText("Comida 1 (aproximadamente a las 6 am)\n"
                        + "1 vaso de leche descremada con una taza de corn flakes.\n"
                        + "11/2 taza de frijoles cocidos.\n"
                        + "2 rebanadas de pan integral.\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Comida 2 (aproximadamente a las 9 am)\n"
                        + "1 vaso de leche descremada con 6 cucharadas de avena\n"
                        + "\n"
                        + "Comida 3 (aproximadamente a la 1 pm)\n"
                        + "1/2 pechuga de pollo asada o a la plancha\n"
                        + "1 taza de arroz cocido\n"
                        + "4 rebanadas de pan integral o 4 tortillas de maíz\n"
                        + "Ensalada fresca al gusto\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Comida 4 (aproximadamente a las 5 pm)\n"
                        + "1 vaso de leche descremada con 6 cucharadas de avena\n"
                        + "\n"
                        + "Comida 5 (aproximadamente a las 8 pm)\n"
                        + "1 1/4 taza de atún en agua\n"
                        + "2 rebanadas de pan integral\n"
                        + "1 taza de espinaca cocida\n"
                        + "1 plátano (macho) cocido\n"
                        + "Agua a libre demanda\n"
                        + "Para variar la comida\n"
                        + "»1 pan integral = 4 galletas soda integral\n"
                        + "»1 taza de corn flakes = 2 cucharadas de maicena o media taza de cualquier cereal que combine hojuelas de maíz con semillas.\n"
                        + "»1 1/2 taza de frijoles cocidos = 11/2 taza de garbanzos cocidos.\n"
                        + "»1/2 pechuga de pollo a la plancha o asada = 6 onzas de carne de res o 1 filete de lonja de pescado, siempre asados o a la plancha.\n"
                        + "»1 1/4 taza de atún en agua = 1 filete de pechuga de pollo con 3 rodajas de jamón de pavo o 1 filete de lonja de pescado ó 1/2 pechuga de pollo, todos asados o a la plancha.\n"
                        + "»1 plátano (macho) cocido = 2 manzanas, 2 peras o 2 naranjas.");
                break;
            case "Dieta de 2800 calorias":
                DietaName.setText("Dieta de 2800 calorias");
                DietaText.setText("Comida 1 (aproximadamente a las 6 am)\n"
                        + "1 vaso de leche descremada con una taza de corn flakes.\n"
                        + "1 1/2 taza de frijoles cocidos.\n"
                        + "3 rebanadas de pan integral.\n"
                        + "1 pera, manzana o naranja.\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Comida 2 (aproximadamente a las 9 am)\n"
                        + "1 vaso de leche descremada con 6 cucharadas de avena\n"
                        + "\n"
                        + "Comida 3 (aproximadamente a la 1 pm)\n"
                        + "1/2 pechuga de pollo asada o a la plancha\n"
                        + "1 taza de arroz cocido\n"
                        + "4 rebanadas de pan integral o 4 tortillas de maíz\n"
                        + "Ensalada fresca al gusto\n"
                        + "1 manzana, pera o naranja\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Comida 4 (aproximadamente a las 5 pm)\n"
                        + "1 vaso de leche descremada con 6 cucharadas de avena\n"
                        + "\n"
                        + "Comida 5 (aproximadamente a las 8 pm)\n"
                        + "1 1/4 taza de atún en agua\n"
                        + "2 rebanadas de pan integral\n"
                        + "1 taza de espinaca cocida\n"
                        + "1 plátano (macho) cocido\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Para variar la comida\n"
                        + "»1 pan integral = 4 galletas soda integral\n"
                        + "»1 taza de corn flakes = 2 cucharadas de maicena o media taza de cualquier cereal que combine hojuelas de maíz con semillas.\n"
                        + "»1 1/2 taza de frijoles cocidos = 11/2 taza de garbanzos cocidos.\n"
                        + "»1 manzana, pera o naranja = 1 durazno, 1 taza de melón o sandia, 3 ciruelas ó 10 uvas.\n"
                        + "»1/2 pechuga de pollo a la plancha o asada = 6 onzas de carne de res ó 1 filete de lonja de pescado, siempre asados o a la plancha.\n"
                        + "»1 1/4 taza de atún en agua = 1 filete de pechuga de pollo con 3 rodajas de jamón de pavo ó 1 filete de lonja de pescado ó 1/2 pechuga de pollo, todos asados o a la plancha.\n"
                        + "»1 plátano (macho) cocido = 2 manzanas, 2 peras o 2 naranjas.");
                break;
            case "Dieta de 3000 calorias":
                DietaName.setText("Dieta de 3000 calorias");
                DietaText.setText("Comida 1 (aproximadamente a las 6 am)\n"
                        + "1 vaso de leche descremada con una taza de corn flakes.\n"
                        + "1 1/2 taza de frijoles cocidos.\n"
                        + "3 porciones de pan integral.\n"
                        + "1 fruta (pera, manzana o naranja).\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Comida 2 (aproximadamente a las 9 am)\n"
                        + "Un vaso de leche descremada con seis cucharadas de avena\n"
                        + "\n"
                        + "Comida 3 (aproximadamente a la 1 pm)\n"
                        + "1 pechuga de pollo asada o a la plancha\n"
                        + "1 taza de arroz cocido\n"
                        + "4 porciones de pan integral ó 4 tortillas de maíz\n"
                        + "Ensalada fresca al gusto\n"
                        + "1 fruta (manzana, pera o naranja)\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Comida 4 (aproximadamente a las 5 pm)\n"
                        + "Un vaso de leche descremada con seis cucharadas de avena\n"
                        + "\n"
                        + "Comida 5 (aproximadamente a las 8 pm)\n"
                        + "1 1/4 taza de atún en agua\n"
                        + "3 porciones de pan integral\n"
                        + "2 tazas de espinaca cocida\n"
                        + "1 plátano (macho) cocido\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Para variar la comida\n"
                        + "»1 pan integral = 4 galletas soda integral\n"
                        + "»1 taza de corn flakes = 2 cucharadas de maicena o media taza de cualquier cereal que combine hojuelas de maíz con semillas.\n"
                        + "»1 1/2 taza de frijoles cocidos = 11/2 taza de garbanzos cocidos.\n"
                        + "»1 manzana, pera o naranja = 1 durazno, 1 taza de melón o sandia, 3 ciruelas o 10 uvas.\n"
                        + "»1 pechuga de pollo a la plancha o asada = 10 onzas de carne de res o 2 filetes de lonja de pescado, siempre asados o a la plancha.\n"
                        + "»1 1/4 taza de atún en agua = 1 filete de pechuga de pollo con 3 rodajas de jamón de pavo ó 1 filete de lonja de pescado o 1/2 pechuga de pollo, todos asados o a la plancha.\n"
                        + "»1 plátano (macho) cocido = 2 manzanas, 2 peras o 2 naranjas.");
                break;
            case "Dieta de 3200 calorias":
                DietaName.setText("Dieta de 3200 calorias");
                DietaText.setText("Comida 1 (aproximadamente a las 6 am)\n"
                        + "1 vaso de leche descremada con una taza de corn flakes.\n"
                        + "11/2 taza de frijoles cocidos.\n"
                        + "4 rebanadas de pan integral.\n"
                        + "1 pera, manzana o naranja.\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Comida 2 (aproximadamente a las 9 am)\n"
                        + "1 vaso de leche descremada con 6 cucharadas de avena\n"
                        + "\n"
                        + "Comida 3 (aproximadamente a la 1 pm)\n"
                        + "1pechuga de pollo asada o a la plancha\n"
                        + "1 taza de arroz cocido\n"
                        + "4 rebanadas de pan integral o 4 tortillas de maíz\n"
                        + "Ensalada fresca al gusto\n"
                        + "1 manzana, pera o naranja\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Comida 4 (aproximadamente a las 5 pm)\n"
                        + "1 vaso de leche descremada con 6 cucharadas de avena\n"
                        + "\n"
                        + "Comida 5 (aproximadamente a las 8 pm)\n"
                        + "2 tazas de atún en agua\n"
                        + "4 rebanadas de pan integral\n"
                        + "2 tazas de espinaca cocida\n"
                        + "1 plátano (macho) cocido\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Para variar la comida\n"
                        + "»1 pan integral = 4 galletas soda integral\n"
                        + "»1 taza de corn flakes = 2 cucharadas de maicena o media taza de cualquier cereal que combine hojuelas de maíz con semillas.\n"
                        + "»1 1/2 taza de frijoles cocidos = 11/2 taza de garbanzos cocidos.\n"
                        + "»1 manzana, pera o naranja = 1 durazno, 1 taza de melón o sandia, 3 ciruelas o 10 uvas.\n"
                        + "»1 pechuga de pollo a la plancha o asada = 10 onzas de carne de res o 2 filetes de lonja de pescado, siempre asados o a la plancha.\n"
                        + "»2 tazas de atún en agua = 11/2 filete de pechuga de pollo con 4 rodajas de jamón de pavo o 11/2 filete de lonja de pescado o 1 pechuga de pollo, todos asados o a la plancha.\n"
                        + "»1 plátano (macho) cocido = 2 manzanas, 2 peras o 2 naranjas.");
                break;
            case "Dieta de 3400 calorias":
                DietaName.setText("Dieta de 3400 calorias");
                DietaText.setText("Comida 1 (aproximadamente a las 6 am)\n"
                        + "1 vaso de leche descremada con una taza de corn flakes.\n"
                        + "1 1/2 taza de frijoles cocidos.\n"
                        + "4 rebanadas de pan integral.\n"
                        + "1 pera, manzana o naranja.\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Comida 2 (aproximadamente a las 9 am)\n"
                        + "1 vaso de leche descremada con 6 cucharadas de avena\n"
                        + "\n"
                        + "Comida 3 (aproximadamente a la 1 pm)\n"
                        + "1 pechuga de pollo asada o a la plancha\n"
                        + "1 taza de arroz cocido\n"
                        + "4 rebanadas de pan integral o 4 tortillas de maíz\n"
                        + "Ensalada fresca al gusto\n"
                        + "1 manzana, pera o naranja\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Comida 4 (aproximadamente a las 5 pm)\n"
                        + "2 vasos de leche descremada con 6 cucharadas de avena en cada vaso\n"
                        + "\n"
                        + "Comida 5 (aproximadamente a las 8 pm)\n"
                        + "2 tazas de atún en agua\n"
                        + "4 rebanadas de pan integral\n"
                        + "2 tazas de espinaca cocida\n"
                        + "1 plátano (macho) cocido\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Para variar la comida\n"
                        + "»1 pan integral = 4 galletas soda integral\n"
                        + "»1 taza de corn flakes = 2 cucharadas de maicena o media taza de cualquier cereal que combine hojuelas de maíz con semillas.\n"
                        + "»1 1/2 taza de frijoles cocidos = 11/2 taza de garbanzos cocidos.\n"
                        + "»1 manzana, pera o naranja = 3 ciruelas, 1 durazno, 10 uvas, 1 taza de melón o sandia.\n"
                        + "»1 pechuga de pollo a la plancha o asada = 10 onzas de carne de res o 2 filetes de lonja de pescado, siempre asados o a la plancha.\n"
                        + "»2 tazas de atún en agua = 11/2 filete de pechuga de pollo asado con 4 rodajas de jamón de pavo o 11/2 filete de lonja de pescado o 1 pechuga de pollo. Los dos últimos a la plancha o asados.\n"
                        + "»1 taza de espinaca cocida = 2 tazas de brócoli cocido.\n"
                        + "»1 plátano (macho) cocido = 2 manzanas, 2 peras o 2 naranjas.");
                break;
            case "Dieta de 3600 calorias":
                DietaName.setText("Dieta de 3600 calorias");
                DietaText.setText("Comida 1 (aproximadamente a las 6 am)\n"
                        + "1 vaso de leche descremada con una taza de corn flakes.\n"
                        + "1 1/2 taza de frijoles cocidos.\n"
                        + "4 rebanadas de pan integral.\n"
                        + "1 pera, manzana o naranja.\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Comida 2 (aproximadamente a las 9 am)\n"
                        + "2 vasos de leche descremada con 6 cucharadas de avena en cada vaso.\n"
                        + "\n"
                        + "Comida 3 (aproximadamente a la 1 pm)\n"
                        + "1 pechuga de pollo asada o a la plancha\n"
                        + "1 taza de arroz cocido\n"
                        + "4 rebanadas de pan integral ó 4 tortillas de maíz\n"
                        + "Ensalada fresca al gusto.\n"
                        + "1 manzana, pera o naranja.\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Comida 4 (aproximadamente a las 5 pm)\n"
                        + "2 vasos de leche descremada con 6 cucharadas de avena en cada vaso.\n"
                        + "\n"
                        + "Comida 5 (aproximadamente a las 8 pm)\n"
                        + "2 tazas de atún en agua\n"
                        + "4 rebanadas de pan integral\n"
                        + "2 tazas de espinaca cocida\n"
                        + "1 plátano (macho) cocido\n"
                        + "Agua a libre demanda\n"
                        + "\n"
                        + "Para variar la comida\n"
                        + "»1 pan integral = 4 galletas soda integral\n"
                        + "»1 taza de corn flakes = 2 cucharadas de maicena o media taza de cualquier cereal que combine hojuelas de maíz con semillas.\n"
                        + "»1 1/2 taza de frijoles cocidos = 11/2 taza de garbanzos cocidos.\n"
                        + "»1 manzana, pera o naranja = 1 durazno, 1 taza de melón o sandia, 3 ciruelas ó 10 uvas.\n"
                        + "»1 pechuga de pollo a la plancha o asada = 10 onzas de carne de res ó 2 filetes de lonja de pescado, siempre asados o a la plancha.\n"
                        + "»2 tazas de atún en agua = 11/2 filete de pechuga de pollo con 4 rodajas de jamón de pavo o 11/2 filete de lonja de pescado o 1 pechuga de pollo, todos asados o a la plancha.\n"
                        + "»1 taza de espinaca cocida = 2 tazas de brócoli cocido\n"
                        + "»1 plátano (macho) cocido = 2 manzanas, 2 peras o 2 naranjas.");
                break;
            default:
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DietaName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DietaText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(360, 0));
        setPreferredSize(new java.awt.Dimension(1020, 725));

        DietaName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DietaName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DietaName.setText("Dietas");

        DietaText.setEditable(false);
        DietaText.setColumns(20);
        DietaText.setLineWrap(true);
        DietaText.setRows(5);
        DietaText.setPreferredSize(new java.awt.Dimension(1000, 750));
        jScrollPane1.setViewportView(DietaText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(DietaName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DietaName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DietasClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DietasClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DietasClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DietasClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DietasClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DietaName;
    private javax.swing.JTextArea DietaText;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public static class UserDieta {

        public UserDieta() {
        }
    }
}
