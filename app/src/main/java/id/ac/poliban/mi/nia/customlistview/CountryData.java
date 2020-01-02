package id.ac.poliban.mi.nia.customlistview;

import java.util.ArrayList;
import java.util.List;

public class CountryData {
    static List<Country> getAllCountry() {
        List<Country> data = new ArrayList<>();{
            data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/125px-Flag_of_Argentina.svg.png", "Argentina", "Argentina (Spanish: [aɾxenˈtina]), officially the Argentine Republic[A] (Spanish: República Argentina), is a country located mostly in the southern half of South America. Sharing the bulk of the Southern Cone with Chile to the west, the country is also bordered by Bolivia and Paraguay to the north, Brazil to the northeast, Uruguay and the South Atlantic Ocean to the east, and the Drake Passage to the south. With a mainland area of 2,780,400 km2 (1,073,500 sq mi),[B] Argentina is the eighth-largest country in the world, the fourth largest in the Americas, the second largest in South America after Brazil, and the largest Spanish-speaking nation. The sovereign state is subdivided into twenty-three provinces (Spanish: provincias, singular provincia) and one autonomous city (ciudad autónoma), Buenos Aires, which is the federal capital of the nation (Spanish: Capital Federal) as decided by Congress.[17] The provinces and the capital have their own constitutions, but exist under a federal system. Argentina claims sovereignty over part of Antarctica, the Falkland Islands (Spanish: Islas Malvinas), and South Georgia and the South Sandwich Islands. "));
            data.add(new Country("https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/125px-Flag_of_Brazil.svg.png", "Brazil", "Brazil (Portuguese: Brasil; Portuguese pronunciation: [bɾaˈziw]),[nt 1] officially the Federative Republic of Brazil (Portuguese: República Federativa do Brasil, About this soundlisten (help·info)),[9] is the largest country in both South America and Latin America. At 8.5 million square kilometers (3.2 million square miles)[10] and with over 208 million people, Brazil is the world's fifth-largest country by area and the fifth most populous. Its capital is Brasília, and its most populated city is São Paulo. The federation is composed of the union of the 26 states, the Federal District, and the 5,570 municipalities. It is the largest country to have Portuguese as an official language and the only one in the Americas;[11][12] it is also one of the most multicultural and ethnically diverse nations, due to over a century of mass immigration from around the world.[13] "));
            data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Flag_of_Paraguay.svg/125px-Flag_of_Paraguay.svg.png", "Paraguay", "Paraguay (/ˈpærəɡwaɪ/; Spanish pronunciation: [paɾaˈɣwaj] (About this soundlisten); Guarani: Paraguái, [paɾaˈɰwaj]), officially the Republic of Paraguay (Spanish: República del Paraguay; Guarani: Tetã Paraguái), is a country in South America. It is bordered by Argentina to the south and southwest, Brazil to the east and northeast, and Bolivia to the northwest. Although it is one of only two landlocked countries in South America (the other is Bolivia), the country has coasts,[9] beaches[10] and ports on the Paraguay and Paraná rivers that give exit to the Atlantic Ocean through the Paraná-Paraguay Waterway.[11] Due to its central location in South America, it is sometimes referred to as Corazón de Sudamérica (\"Heart of South America\").[12] "));
            data.add(new Country("https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/125px-Flag_of_Germany.svg.png", "Germany", "Germany (German: Deutschland, German pronunciation: [ˈdɔʏtʃlant]), officially the Federal Republic of Germany (German: Bundesrepublik Deutschland, About this soundlisten (help·info)),[h] is a country in Central and Western Europe, lying between the Baltic and North Seas to the north and the Alps, Lake Constance and the High Rhine to the south. It borders Denmark to the north, Poland and the Czech Republic to the east, Austria and Switzerland to the south, France to the southwest, and Luxembourg, Belgium and the Netherlands to the west. "));
            data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Flag_of_Croatia.svg/125px-Flag_of_Croatia.svg.png", "Croatia", "Croatia (/kroʊˈeɪʃə/ (About this soundlisten), kroh-AY-shə; Croatian: Hrvatska, pronounced [xř̩ʋaːtskaː]), officially the Republic of Croatia (Croatian: Republika Hrvatska, About this soundlisten (help·info)),[d] is a country at the crossroads of Central and Southeast Europe, on the Adriatic Sea. It borders Slovenia to the northwest, Hungary to the northeast, Serbia to the east, Bosnia and Herzegovina, and Montenegro to the southeast, sharing a maritime border with Italy. Its capital, Zagreb, forms one of the country's primary subdivisions, along with twenty counties. Croatia has an area of 56,594 square kilometres (21,851 square miles) and a population of 4.28 million, most of whom are Roman Catholics. "));
            data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_Japan%28bordered%29.svg/125px-Flag_of_Japan%28bordered%29.svg.png", "Japan", "Japan (Japanese: 日本, Nippon [ɲippoꜜɴ] (About this soundlisten) or Nihon [ɲihoꜜɴ] (About this soundlisten); formally 日本国, About this soundNippon-koku or Nihon-koku, lit. 'State of Japan') is an island country in East Asia. Located in the Pacific Ocean, it lies off the eastern coast of the Asian continent and stretches from the Sea of Okhotsk in the north to the East China Sea and the Philippine Sea in the south. "));
            data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Flag_of_South_Korea.svg/125px-Flag_of_South_Korea.svg.png", "South Korea", "outh Korea (Korean: 한국; RR: Hanguk or literally 남한; RR: Namhan; officially the Republic of Korea 대한민국; RR: Daehan Minguk) is a country in East Asia, constituting the southern part of the Korean Peninsula[11] and sharing a land border with North Korea. The name Korea is derived from Goguryeo which was one of the great powers in East Asia during its time,[12][13][14][15] ruling most of the Korean Peninsula, Manchuria, parts of the Russian Far East[16] and Inner Mongolia[17] under Gwanggaeto the Great.[18] Its capital, Seoul, is a major global city[19] and half of South Korea's over 51 million people live in the Seoul Capital Area, the fourth largest metropolitan economy in the world.[20]"));
            data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/125px-Flag_of_the_People%27s_Republic_of_China.svg.png", "China", "China (Chinese: 中国; pinyin: Zhōngguó; literally: 'Central State' or 'Middle Kingdom'), officially known as the People's Republic of China (PRC), is a country in East Asia and the world's most populous country, with a population of around 1.404 billion in 2017.[12] Covering approximately 9,600,000 square kilometers (3,700,000 sq mi), it is the third or fourth largest country by total area.[j][18] Governed by the Communist Party of China, the state exercises jurisdiction over 22 provinces, five autonomous regions, four direct-controlled municipalities (Beijing, Tianjin, Shanghai, and Chongqing), and the special administrative regions of Hong Kong and Macau. "));
            data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Flag_of_Singapore.svg/125px-Flag_of_Singapore.svg.png", "Singapore", "Singapore (/ˈsɪŋ(ɡ)əpɔːr/ (About this soundlisten)), officially the Republic of Singapore, is a sovereign island city-state in Southeast Asia. The country is situated one degree (137 kilometres or 85 miles) north of the equator, at the southern tip of the Malay Peninsula, with Indonesia's Riau Islands to the south and Peninsular Malaysia to the north. Singapore's territory consists of one main island along with 62 other islets. Since independence, extensive land reclamation has increased its total size by 23% (130 square kilometres or 50 square miles). "));
            data.add(new Country("https://upload.wikimedia.org/wikipedia/en/thumb/0/03/Flag_of_Italy.svg/125px-Flag_of_Italy.svg.png", "Italy", "Italy (Italian: Italia [iˈtaːlja] (About this soundlisten)), officially the Italian Republic (Italian: Repubblica Italiana [reˈpubblika itaˈljaːna]),[12][13][14][15] is a European country consisting of a peninsula delimited by the Alps and surrounded by several islands. Italy is located in Southern Europe,[16] and it is sometimes considered as part of Western Europe.[17][18] The country covers a total area of 301,340 km2 (116,350 sq mi) and shares land borders with France, Switzerland, Austria, Slovenia, and the enclaved microstates of Vatican City and San Marino. Italy has a territorial exclave in Switzerland (Campione) and a maritime exclave in the Tunisian Sea (Lampedusa). With around 60 million inhabitants, Italy is the fourth-most populous member state of the European Union. "));
        }
        return data;
    }
}

