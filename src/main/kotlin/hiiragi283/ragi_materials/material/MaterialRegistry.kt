package hiiragi283.ragi_materials.material

import hiiragi283.ragi_materials.render.color.RagiColor

object MaterialRegistry {

    val list: MutableList<MaterialBuilder> = mutableListOf()

    //0: WILDCARD
    val WILDCARD = MaterialBuilder(0, "wildcard", MaterialType.WILDCARD)
            .setMolarMass(1024.0f).setFormula("WILDCARD")
            .setTempMelt(1024).setTempBoil(1024)

    //1 ~ 94: Periodic Table
    //1st Period
    val HYDROGEN = MaterialBuilder(1, "hydrogen", MaterialType.GAS)
        .setColor(RagiColor.BLUE).setMolarMass(1.0f).setFormula("H")
        .setTempMelt(-259).setTempBoil(-253)

    val HELIUM = MaterialBuilder(2, "helium", MaterialType.GAS)
        .setColor(RagiColor.YELLOW).setMolarMass(4.0f).setFormula("He")
        .setTempMelt(-272).setTempBoil(-269)

    //2nd Period
    val LITHIUM = MaterialBuilder(3, "lithium", MaterialType.METAL)
        .setColor(RagiColor.GRAY).setMolarMass(7.0f).setFormula("Li")
        .setTempMelt(181).setTempBoil(1342)

    val BERYLLIUM = MaterialBuilder(4, "beryllium", MaterialType.METAL)
        .setColor(RagiColor.DARK_GREEN).setMolarMass(9.0f).setFormula("Be")
        .setTempMelt(1287).setTempBoil(2469)

    val BORON = MaterialBuilder(5, "boron", MaterialType.DUST)
        .setColor(RagiColor.DARK_GRAY).setMolarMass(10.8f).setFormula("B")
        .setTempMelt(2075).setTempBoil(4000)

    val CARBON = MaterialBuilder(6, "carbon", MaterialType.SEMIMETAL)
        .setColor(RagiColor.mixColor(RagiColor.BLACK, RagiColor.DARK_GRAY)).setMolarMass(12.0f).setFormula("C")
        .setTempSubl(4400)

    val NITROGEN = MaterialBuilder(7, "nitrogen", MaterialType.GAS)
        .setColor(RagiColor.AQUA).setMolarMass(14.0f).setFormula("N")
        .setTempMelt(-210).setTempBoil(-196)

    val OXYGEN = MaterialBuilder(8, "oxygen", MaterialType.GAS)
        .setColor(RagiColor.AQUA).setMolarMass(16.0f).setFormula("O")
        .setTempMelt(-219).setTempBoil(-183)

    val FLUORINE = MaterialBuilder(9, "fluorine", MaterialType.GAS)
        .setColor(RagiColor.GREEN).setMolarMass(19.0f).setFormula("F")
        .setTempMelt(-220).setTempBoil(-188)

    val NEON = MaterialBuilder(10, "neon", MaterialType.GAS)
        .setColor(RagiColor.LIGHT_PURPLE).setMolarMass(20.2f).setFormula("Ne")
        .setTempMelt(-249).setTempBoil(-246)

    //3rd Period
    val SODIUM = MaterialBuilder(11, "sodium", MaterialType.INTERNAL)
        .setMolarMass(23.0f).setFormula("Na")
        .setTempMelt(98).setTempBoil(883)

    val MAGNESIUM = MaterialBuilder(12, "magnesium", MaterialType.METAL)
        .setColor(RagiColor.mixColor(RagiColor.LIGHT_PURPLE, RagiColor.WHITE)).setMolarMass(24.3f).setFormula("Mg")
        .setTempMelt(650).setTempBoil(1090)

    val ALUMINIUM = MaterialBuilder(13, "aluminium", MaterialType.METAL)
        .setColor(RagiColor.mixColor(RagiColor.AQUA, RagiColor.WHITE)).setMolarMass(27.0f).setFormula("Al")
        .setTempMelt(660).setTempBoil(2519)

    val SILICON = MaterialBuilder(14, "silicon", MaterialType.METAL)
        .setColor(RagiColor.DARK_GRAY).setMolarMass(28.1f).setFormula("Si")
        .setTempMelt(1414).setTempBoil(3265)

    val PHOSPHORUS = MaterialBuilder(15, "phosphorus", MaterialType.DUST)
        .setColor(RagiColor.YELLOW).setMolarMass(31.0f).setFormula("P")
        .setTempMelt(44).setTempBoil(281)

    val SULFUR = MaterialBuilder(16, "sulfur", MaterialType.DUST)
        .setColor(RagiColor.mixColor(RagiColor.GOLD, RagiColor.YELLOW)).setMolarMass(32.1f).setFormula("S")
        .setTempMelt(120).setTempBoil(445)

    val CHLORINE = MaterialBuilder(17, "chlorine", MaterialType.GAS)
        .setColor(RagiColor.YELLOW).setMolarMass(35.5f).setFormula("Cl")
        .setTempMelt(-102).setTempBoil(-34)

    val ARGON = MaterialBuilder(18, "argon", MaterialType.GAS)
        .setColor(RagiColor.LIGHT_PURPLE).setMolarMass(40.0f).setFormula("Ar")
        .setTempMelt(-189).setTempBoil(-186)

    //4th Period
    val POTASSIUM = MaterialBuilder(19, "potassium", MaterialType.INTERNAL)
        .setMolarMass(39.1f).setFormula("K")
        .setTempMelt(64).setTempBoil(759)

    val CALCIUM = MaterialBuilder(20, "calcium", MaterialType.INTERNAL)
        .setMolarMass(40.1f).setFormula("Ca")
        .setTempMelt(842).setTempBoil(1484)

    val TITANIUM = MaterialBuilder(22, "titanium", MaterialType.METAL)
        .setColor(RagiColor.mixColor(mapOf(RagiColor.GOLD to 1, RagiColor.WHITE to 2))).setMolarMass(47.9f).setFormula("Ti")
        .setTempMelt(1668).setTempBoil(3287)

    val CHROMIUM = MaterialBuilder(24, "chromium", MaterialType.METAL)
        .setColor(RagiColor.GREEN).setMolarMass(52.0f).setFormula("Cr")
        .setTempMelt(1907).setTempBoil(2671)

    val MANGANESE = MaterialBuilder(25, "manganese", MaterialType.METAL)
        .setColor(RagiColor.mixColor(RagiColor.RED, RagiColor.WHITE)).setMolarMass(54.9f).setFormula("Mn")
        .setTempMelt(1246).setTempBoil(2061)

    val IRON = MaterialBuilder(26, "iron", MaterialType.METAL)
        .setMolarMass(55.8f).setFormula("Fe")
        .setTempMelt(1538).setTempBoil(2861)

    val COBALT = MaterialBuilder(27, "cobalt", MaterialType.METAL)
        .setColor(RagiColor.BLUE).setMolarMass(58.9f).setFormula("Co")
        .setTempMelt(1495).setTempBoil(2927)

    val NICKEL = MaterialBuilder(28, "nickel", MaterialType.METAL)
        .setColor(RagiColor.mixColor(RagiColor.GOLD, RagiColor.WHITE)).setMolarMass(58.7f).setFormula("Ni")
        .setTempMelt(1455).setTempBoil(2913)

    val COPPER = MaterialBuilder(29, "copper", MaterialType.METAL)
        .setColor(RagiColor.mixColor(RagiColor.GOLD, RagiColor.RED)).setMolarMass(63.5f).setFormula("Cu")
        .setTempMelt(1085).setTempBoil(2562)

    val ZINC = MaterialBuilder(30, "zinc", MaterialType.METAL)
        .setMolarMass(65.4f).setFormula("Zn")
        .setTempMelt(420).setTempBoil(907)

    val GALLIUM = MaterialBuilder(31, "gallium", MaterialType.METAL)
        .setMolarMass(69.7f).setFormula("Ga")
        .setTempMelt(30).setTempBoil(2204)

    val ARSENIC = MaterialBuilder(33, "arsenic", MaterialType.SEMIMETAL)
        .setColor(RagiColor.DARK_GRAY).setMolarMass(74.9f).setFormula("As")
        .setTempSubl(603)

    //5th Period
    val STRONTIUM = MaterialBuilder(38, "strontium", MaterialType.INTERNAL)
        .setMolarMass(87.6f).setFormula("Sr")
        .setTempMelt(777).setTempBoil(1377)

    val ZIRCONIUM = MaterialBuilder(40, "zirconium", MaterialType.METAL)
        .setColor(RagiColor.mixColor(RagiColor.BLUE, RagiColor.LIGHT_PURPLE)).setMolarMass(91.2f).setFormula("Zr")
        .setTempMelt(1855).setTempBoil(4409)

    val NIOBIUM = MaterialBuilder(41, "niobium", MaterialType.METAL)
        .setColor(RagiColor.mixColor(RagiColor.DARK_BLUE, RagiColor.WHITE)).setMolarMass(92.9f).setFormula("Nb")
        .setTempMelt(2477).setTempBoil(4744)

    val MOLYBDENUM = MaterialBuilder(42, "molybdenum", MaterialType.METAL)
        .setColor(RagiColor.mixColor(RagiColor.DARK_BLUE, RagiColor.WHITE)).setMolarMass(96.0f).setFormula("Mo")
        .setTempMelt(2023).setTempBoil(4639)

    val RUTHENIUM = MaterialBuilder(44, "ruthenium", MaterialType.METAL)
        .setColor(RagiColor.mixColor(mapOf(RagiColor.LIGHT_PURPLE to 1, RagiColor.WHITE to 3))).setMolarMass(101.1f).setFormula("Ru")
        .setTempMelt(2334).setTempBoil(4150)

    val RHODIUM = MaterialBuilder(45, "rhodium", MaterialType.METAL)
        .setColor(RagiColor.mixColor(mapOf(RagiColor.RED to 1, RagiColor.WHITE to 3))).setMolarMass(102.9f).setFormula("Rh")
        .setTempMelt(1964).setTempBoil(3695)

    val PALLADIUM = MaterialBuilder(46, "palladium", MaterialType.METAL)
        .setColor(RagiColor.mixColor(mapOf(RagiColor.YELLOW to 1, RagiColor.WHITE to 3))).setMolarMass(106.4f).setFormula("Pa")
        .setTempMelt(1555).setTempBoil(2963)

    val SILVER = MaterialBuilder(47, "silver", MaterialType.METAL)
        .setColor(RagiColor.mixColor(mapOf(RagiColor.AQUA to 1, RagiColor.WHITE to 2))).setMolarMass(107.9f).setFormula("Ag")
        .setTempMelt(962).setTempBoil(2162)

    val INDIUM = MaterialBuilder(49, "indium", MaterialType.METAL)
        .setColor(RagiColor.mixColor(RagiColor.DARK_BLUE, RagiColor.RED)).setMolarMass(114.8f).setFormula("In")
        .setTempMelt(157).setTempBoil(2072)

    val TIN = MaterialBuilder(50, "tin", MaterialType.METAL)
        .setMolarMass(118.7f).setFormula("Sn")
        .setTempMelt(232).setTempBoil(2602)

    val ANTIMONY = MaterialBuilder(51, "antimony", MaterialType.METAL)
        .setColor(RagiColor.DARK_GRAY).setMolarMass(121.8f).setFormula("Sb")
        .setTempMelt(631).setTempBoil(1587)

    val IODINE = MaterialBuilder(53, "iodine", MaterialType.DUST)
        .setColor(RagiColor.mixColor(RagiColor.DARK_BLUE, RagiColor.DARK_RED)).setMolarMass(126.9f).setFormula("I")
        .setTempMelt(114).setTempBoil(184)

    //6th Period
    val BARIUM = MaterialBuilder(56, "barium", MaterialType.INTERNAL)
        .setMolarMass(137.3f).setFormula("Ba")
        .setTempMelt(727).setTempBoil(1845)

    val NEODYMIUM = MaterialBuilder(60, "neodymium", MaterialType.METAL)
        .setColor(RagiColor.GRAY).setMolarMass(144.2f).setFormula("Nd")
        .setTempMelt(1021).setTempBoil(3074)

    val SAMARIUM = MaterialBuilder(62, "samarium", MaterialType.METAL)
        .setColor(RagiColor.GRAY).setMolarMass(150.4f).setFormula("Sa")
        .setTempMelt(1074).setTempBoil(1794)

    val HAFNIUM = MaterialBuilder(72, "hafnium", MaterialType.METAL)
        .setColor(RagiColor.GRAY).setMolarMass(178.5f).setFormula("Hf")
        .setTempMelt(2233).setTempBoil(4603)

    val TANTALUM = MaterialBuilder(73, "tantalum", MaterialType.METAL)
        .setColor(RagiColor.GRAY).setMolarMass(180.9f).setFormula("Ta")
        .setTempMelt(3017).setTempBoil(5458)

    val TUNGSTEN = MaterialBuilder(74, "tungsten", MaterialType.METAL)
        .setColor(RagiColor.mixColor(RagiColor.BLACK, RagiColor.DARK_GRAY)).setMolarMass(183.8f).setFormula("W")
        .setTempMelt(3422).setTempBoil(5555)

    val OSMIUM = MaterialBuilder(76, "osmium", MaterialType.METAL)
        .setColor(RagiColor.mixColor(mapOf(RagiColor.BLUE to 1, RagiColor.WHITE to 3))).setMolarMass(190.2f).setFormula("Os")
        .setTempMelt(3033).setTempBoil(5012)

    val IRIDIUM = MaterialBuilder(77, "iridium", MaterialType.METAL)
        .setColor(RagiColor.mixColor(mapOf(RagiColor.AQUA to 1, RagiColor.WHITE to 3))).setMolarMass(192.2f).setFormula("Ir")
        .setTempMelt(2446).setTempBoil(4428)

    val PLATINUM = MaterialBuilder(78, "platinum", MaterialType.METAL)
        .setColor(RagiColor.mixColor(mapOf(RagiColor.GREEN to 1, RagiColor.WHITE to 3))).setMolarMass(195.1f).setFormula("Pt")
        .setTempMelt(1768).setTempBoil(3825)

    val GOLD = MaterialBuilder(79, "gold", MaterialType.METAL)
        .setColor(RagiColor.YELLOW).setMolarMass(197.0f).setFormula("Au")
        .setTempMelt(1064).setTempBoil(2856)

    val MERCURY = MaterialBuilder(80, "mercury", MaterialType.LIQUID)
        .setMolarMass(200.6f).setFormula("Hg")
        .setTempMelt(-39).setTempBoil(357)

    val LEAD = MaterialBuilder(82, "lead", MaterialType.METAL)
        .setColor(RagiColor.mixColor(RagiColor.DARK_BLUE, RagiColor.DARK_GRAY, RagiColor.WHITE)).setMolarMass(207.2f).setFormula("Pb")
        .setTempMelt(327).setTempBoil(1749)

    val BISMUTH = MaterialBuilder(83, "bismuth", MaterialType.METAL)
        .setColor(RagiColor.DARK_AQUA).setMolarMass(209.0f).setFormula("Bi")
        .setTempMelt(271).setTempBoil(1564)

    //7th Period
    val THORIUM = MaterialBuilder(90, "thorium", MaterialType.METAL_RADIO)
        .setColor(RagiColor.mixColor(RagiColor.BLACK, RagiColor.DARK_GREEN)).setMolarMass(232.0f).setFormula("Th")
        .setTempMelt(1750).setTempBoil(4788)

    val URANIUM_238 = MaterialBuilder(92, "uranium", MaterialType.METAL_RADIO)
        .setColor(RagiColor.GREEN).setMolarMass(238.0f).setFormula("U")
        .setTempMelt(1135).setTempBoil(4131)

    val PLUTONIUM_239 = MaterialBuilder(94, "plutonium", MaterialType.METAL_RADIO)
        .setColor(RagiColor.RED).setMolarMass(239.0f).setFormula("Pu")
        .setTempMelt(640).setTempBoil(3228)

    //95 ~ 99: Isotope
    val DEUTERIUM = IsotopeBuilder(95, "deuterium", HYDROGEN)
        .setMolarMass(2.0f).setFormula("D")

    val TRITIUM = IsotopeBuilder(96, "tritium", HYDROGEN)
        .setMolarMass(3.0f).setFormula("T")

    val URANIUM_235  = IsotopeBuilder(97, "uranium235", URANIUM_238)
        .setMolarMass(235.0f).setFormula("U-235")

    val PLUTONIUM_241 = IsotopeBuilder(98, "plutonium241", PLUTONIUM_239)
        .setMolarMass(241.0f).setFormula("Pu-241")

    //100 ~ 199: Atomic Group
    val HYDROXIDE = CompoundBuilder(100, "hydroxide", MaterialType.INTERNAL, mapOf(OXYGEN to 1, HYDROGEN to 1))

    val BORATE = CompoundBuilder(101, "borate", MaterialType.INTERNAL, mapOf(BORON to 1, OXYGEN to 3))

    val CARBONATE = CompoundBuilder(102, "carbonate", MaterialType.INTERNAL, mapOf(CARBON to 1, OXYGEN to 3))

    val NITRATE = CompoundBuilder(103, "nitrate", MaterialType.INTERNAL, mapOf(NITROGEN to 1, OXYGEN to 3))

    val SILICATE = CompoundBuilder(104, "silicate", MaterialType.INTERNAL, mapOf(SILICON to 1, OXYGEN to 3))

    val PHOSPHATE = CompoundBuilder(105, "phosphate", MaterialType.INTERNAL, mapOf(PHOSPHORUS to 1, OXYGEN to 4))

    val SULFATE = CompoundBuilder(106, "sulfate", MaterialType.INTERNAL, mapOf(SULFUR to 1, OXYGEN to 4))

    //200 ~ 299: Vanilla
    val STONE = CompoundBuilder(200, "stone", MaterialType.DUST, mapOf(SILICON to 1, OXYGEN to 2))
        .setColor(RagiColor.GRAY)

    val WOOD = MaterialBuilder(201, "wood", MaterialType.DUST)
        .setColor(RagiColor.mixColor(mapOf(RagiColor.DARK_GRAY to 2, RagiColor.RED to 1, RagiColor.YELLOW to 1)))
        .setFormula("?")

    val WATER = CompoundBuilder(202, "water", MaterialType.INTERNAL, mapOf(HYDROGEN to 2, OXYGEN to 1))
        .setColor(RagiColor.BLUE)

    val LAVA = CompoundBuilder(203, "lava", MaterialType.INTERNAL, mapOf(STONE to 1))
        .setColor(RagiColor.mixColor(RagiColor.DARK_RED, RagiColor.GOLD))

    val GLASS = CompoundBuilder(204, "glass", MaterialType.DUST, mapOf(STONE to 1))
        .setColor(RagiColor.WHITE)

    val LAPIS = MaterialBuilder(205, "lapis", MaterialType.DUST)
        .setColor(RagiColor.BLUE)
        .setFormula("?")

    val CLAY = MaterialBuilder(206, "clay", MaterialType.DUST)
        .setColor(RagiColor.mixColor(mapOf(
            RagiColor.BLUE to 1,
            RagiColor.AQUA to 1,
            RagiColor.WHITE to 2)))
        .setFormula("?")

    val BRICK = MaterialBuilder(207, "brick", MaterialType.INGOT)
        .setColor(RagiColor.mixColor(mapOf(
            RagiColor.DARK_RED to 4,
            RagiColor.DARK_PURPLE to 1,
            RagiColor.GOLD to 2,
            RagiColor.WHITE to 3
        )))
        .setFormula("?")

    val OBSIDIAN = CompoundBuilder(208, "obsidian", MaterialType.DUST, mapOf(STONE to 1))
        .setColor(RagiColor.mixColor(mapOf(
            RagiColor.BLACK to 2,
            RagiColor.BLUE to 1,
            RagiColor.RED to 1
        )))

    val REDSTONE = MaterialBuilder(209, "redstone", MaterialType.DUST)
        .setColor(RagiColor.DARK_RED).setFormula("Rs")

    val DIAMOND = CrystalBuilder(210, "diamond", mapOf(CARBON to 1), "diamond")
        .setColor(ALUMINIUM.color)

    val SNOW = CompoundBuilder(211, "snow", MaterialType.INGOT, mapOf(WATER to 1))
        .setColor(RagiColor.WHITE)

    val ICE = CompoundBuilder(212, "ice", MaterialType.INGOT, mapOf(WATER to 1))
        .setColor(ALUMINIUM.color)

    val NETHERRACK = CompoundBuilder(213, "netherrack", MaterialType.DUST, mapOf(STONE.addBracket() to 1, SULFUR to 1, PHOSPHORUS to 1))
        .setColor(RagiColor.DARK_RED)

    val SOUL_SAND = MaterialBuilder(214, "soul_sand", MaterialType.DUST)

    val GLOWSTONE = CompoundBuilder(215, "glowstone", MaterialType.DUST, mapOf(GOLD to 4, REDSTONE to 5))
        .setColor(RagiColor.mixColor(RagiColor.GOLD, RagiColor.YELLOW))

    val NETHER_BRICK = CompoundBuilder(216, "nether_brick", MaterialType.INGOT, mapOf(NETHERRACK to 1))
        .setColor(RagiColor.mixColor(
            mapOf(RagiColor.BLACK to 3,
                RagiColor.DARK_BLUE to 1,
                RagiColor.DARK_RED to 3
            )))

    val END_STONE = CompoundBuilder(217, "end_stone", MaterialType.DUST, mapOf(STONE.addBracket() to 1, HELIUM to 1, TUNGSTEN to 1))
        .setColor(PALLADIUM.color)

    val EMERALD = CrystalBuilder(218, "emerald", mapOf(
        BERYLLIUM to 3,
        ALUMINIUM to 2,
        SILICON to 6,
        OXYGEN to 18
    ), "hexagonal").setColor(RagiColor.GREEN)

    val QUARTZ = CrystalBuilder(219, "quartz", mapOf(STONE to 1), "trigonal")
        .setColor(RagiColor.WHITE)

    val PRISMARINE = CrystalBuilder(220, "prismarine", mapOf(QUARTZ to 1, WATER.addBracket() to 1), "trigonal")
        .setColor(ALUMINIUM.color)

    val BONE = CompoundBuilder(221, "bone", MaterialType.DUST, mapOf(CALCIUM to 3, PHOSPHATE.addBracket() to 2))
        .setColor(RagiColor.WHITE)

    val NITER = CrystalBuilder(222, "niter", mapOf(POTASSIUM to 1, NITRATE to 1), "orthorhombic")
        .setColor(RagiColor.WHITE)

    val GUNPOWDER = CompoundBuilder(223, "gunpowder", MaterialType.DUST, mapOf(NITER.addBracket() to 2, CARBON to 1, SULFUR to 1))
        .setColor(RagiColor.DARK_GRAY)

    val SUGAR = CompoundBuilder(224, "sugar", MaterialType.DUST, mapOf(CARBON to 6, HYDROGEN to 12, OXYGEN to 6))
        .setColor(RagiColor.WHITE)

    //Fossil Fuels
    val COAL = CrystalBuilder(225, "coal", mapOf(CARBON to 1), "coal")

    val CHARCOAL = CrystalBuilder(226, "charcoal", mapOf(CARBON to 1), "coal")

    val COKE = CrystalBuilder(227, "coke", mapOf(CARBON to 1), "coal")
        .setColor(RagiColor.DARK_GRAY)

    val ANTHRACITE = CrystalBuilder(228, "anthracite", mapOf(CARBON to 1), "coal")
        .setColor(RagiColor.mixColor(mapOf(
            CARBON.color to 5,
            RagiColor.DARK_BLUE to 1
        )))

    val LIGNITE = CrystalBuilder(229, "lignite", mapOf(CARBON to 1), "coal")
        .setColor(RagiColor.mixColor(mapOf(
            CARBON.color to 5,
            RagiColor.DARK_RED to 1
        )))

    val PEAT = CrystalBuilder(230, "peat", mapOf(CARBON to 1), "coal")
        .setColor(RagiColor.mixColor(mapOf(
            CARBON.color to 5,
            RagiColor.DARK_GREEN to 1,
            RagiColor.DARK_RED to 1
        )))

    /*
    //200 ~ 299: Gem
    val ALMANDINE = CrystalBuilder(200, "almandine", mapOf(IRON to 3, ALUMINIUM to 2, SILICON to 3, OXYGEN to 12), "cubic")
        .setColor(RagiColor.DARK_RED)

    //val AMBER = CrystalBuilder(201, "amber", mapOf("" to 1), "amorphous")

    val AMETHYST = CrystalBuilder(202, "amethyst", mapOf(SILICON to 1, OXYGEN to 2), "trigonal")
        .setColor(ZIRCONIUM.color)

    val APATITE = CrystalBuilder(203, "apatite", mapOf(CALCIUM to 5, "(PO\u2084)" to 3, "OH" to 1), "hexagonal")
        .setColor(RagiColor.mixColor(RagiColor.YELLOW, RagiColor.WHITE))

    val AQUAMARINE = CrystalBuilder(204, "aquamarine", mapOf(
        BERYLLIUM to 3,
        ALUMINIUM to 2,
        SILICON to 6,
        OXYGEN to 18
    ), "hexagonal").setColor(RagiColor.AQUA)

    val CELESTITE = CrystalBuilder(205, "celestite", mapOf(
        STRONTIUM to 1,
        SULFUR to 1,
        OXYGEN to 4
    ), "orthorhombic").setColor(ALUMINIUM.color)

    val FLUORITE = CrystalBuilder(208, "fluorite", mapOf(CALCIUM to 1, FLUORINE to 2), "diamond")
        .setColor(RagiColor.mixColor(RagiColor.GREEN, RagiColor.AQUA))

    val GYPSUM = CrystalBuilder(209, "gypsum", mapOf(CALCIUM to 1, SULFUR to 1, OXYGEN to 4), "monoclinic")
        .setColor(RHODIUM.color)

    val MALACHITE = CrystalBuilder(210, "malachite", mapOf(
        COPPER to 2,
        "(CO\u2083)" to 1,
        "(OH)" to 2
    ), "monoclinic").setColor(RagiColor.DARK_GREEN)

    val OLIVINE = CrystalBuilder(211, "olivine", mapOf(MAGNESIUM to 2, SILICON to 1, OXYGEN to 4), "monoclinic")
        .setColor(RagiColor.mixColor(RagiColor.GREEN, RagiColor.WHITE))

    val OPAL = CrystalBuilder(212, "opal", mapOf(SILICON to 1, OXYGEN to 2), "amorphous")

    val SALT = CrystalBuilder(213, "salt", mapOf(SODIUM to 1, CHLORINE to 1), "cubic")
        .setColor(RagiColor.WHITE)

    val RUBY = CrystalBuilder(214, "ruby", mapOf(CHROMIUM to 1, ALUMINIUM to 2, OXYGEN to 3), "trigonal")
        .setColor(RagiColor.RED)

    val RUTILE = CrystalBuilder(215, "rutile", mapOf(TITANIUM to 1, OXYGEN to 2), "tetragonal")
        .setColor(TITANIUM.color)

    val SAPPHIRE = CrystalBuilder(216, "sapphire", mapOf(IRON to 1, ALUMINIUM to 2, OXYGEN to 3), "trigonal")
        .setColor(RagiColor.BLUE)

    val TANZANITE = CrystalBuilder(217, "tanzanite", mapOf(
        CALCIUM to 2,
        ALUMINIUM to 2,
        "(SiO\u2084)" to 1,
        "(Si\u2082O\u2087)" to 1,
        OXYGEN to 1,
        "(OH)" to 1
    ), "orthorhombic").setColor(LEAD.color)

    val TAUSONITE = CrystalBuilder(218, "tausonite", mapOf(STRONTIUM to 1, TITANIUM to 1, OXYGEN to 3), "diamond")
        .setColor(RagiColor.WHITE)

    val TOPAZ = CrystalBuilder(219, "topaz", mapOf(ALUMINIUM to 2, SILICON to 1, OXYGEN to 4, FLUORINE to 2), "orthorhombic")
        .setColor(COPPER.color)

    val ZIRCON = CrystalBuilder(220, "zircon", mapOf(ZIRCONIUM to 1, SILICON to 1, OXYGEN to 4), "tetragonal")
        .setColor(ZIRCONIUM.color)

    //300 ~ 399: Alloy
    val TITANIUM_ALLOY = AlloyBuilder(300, "titanium_alloy", mapOf(TITANIUM to 7, ALUMINIUM to 1, CHROMIUM to 1))
        .setColor(TITANIUM.color)

    val ADVANCED_ALLOY = AlloyBuilder(301, "advanced_alloy", mapOf(IRON to 3, COPPER to 3, TIN to 3))

    val INVAR = AlloyBuilder(302, "invar", mapOf(IRON to 2, NICKEL to 1))

    val KANTHAL = AlloyBuilder(303, "kanthal", mapOf(IRON to 6, CHROMIUM to 2, ALUMINIUM to 1))

    val MAGNET = AlloyBuilder(304, "magnet", mapOf(IRON to 7, CELESTITE to 1, "(CaCO\u2083)" to 1))
        .setColor(CARBON.color)

    val MANGALLOY = AlloyBuilder(305, "mangalloy", mapOf(IRON to 6, MANGANESE to 2, CARBON to 1))
        .setColor(RagiColor.mixColor(RagiColor.DARK_RED, RagiColor.WHITE))

    val STAINLESS_STEEL = AlloyBuilder(306, "stainless_steel", mapOf(IRON to 6, CHROMIUM to 2, NICKEL to 1))
        .setColor(RagiColor.mixColor(RagiColor.GRAY, RagiColor.WHITE))

    val STEEL = AlloyBuilder(307, "steel", mapOf(IRON to 1, CARBON to 1))

    val TOOL_STEEL = AlloyBuilder(308, "tool_steel", mapOf(IRON to 6, CHROMIUM to 1, MANGANESE to 1, MOLYBDENUM to 1))

    val CONSTANTAN = AlloyBuilder(309, "constantan", mapOf(NICKEL to 1, COPPER to 1))

    val NICHROME = AlloyBuilder(310, "nichrome", mapOf(NICKEL to 4, CHROMIUM to 1))

    val BRASS = AlloyBuilder(311, "brass", mapOf(COPPER to 3, ZINC to 1))
        .setColor(RagiColor.GOLD)

    val BRONZE = AlloyBuilder(312, "bronze", mapOf(COPPER to 3, TIN to 1))

    val NICKELSILVER = AlloyBuilder(313, "nickelsilver", mapOf(COPPER to 6, NICKEL to 2, ZINC to 1))
        .setColor(SILVER.color)

    val ELECTRUM = AlloyBuilder(314, "electrum", mapOf(SILVER to 1, GOLD to 1))
        .setColor(RagiColor.mixColor(RagiColor.YELLOW, RagiColor.WHITE))

    val TUNGSTEN_STEEL = AlloyBuilder(315, "tungsten_steel", mapOf(TUNGSTEN to 1, STEEL to 1))

    val IRIDIUM_ALLOY = AlloyBuilder(316, "iridium_alloy", mapOf(IRIDIUM to 4, ADVANCED_ALLOY to 4, CARBON to 1))
        .setColor(RagiColor.WHITE)
    */
}