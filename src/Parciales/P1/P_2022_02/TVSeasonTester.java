/*package Parciales.P1.P_2022_02;

import java.time.LocalDate;

public class TVSeasonTester {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2022,9,19)); // 2022-09-19

        TVEpisode ep1 = new TVEpisode(234,"0_hellofriend.mov",8.5,LocalDate.of(2022,9,19));
        TVEpisode ep2 = new TVEpisode(235,"1_ones-and-zer0es.mpeg",9.2,LocalDate.of(2022,9,19));
        TVEpisode ep3 = new TVEpisode(89,"2_d3bug.mkv",8.9,LocalDate.of(2022,9,20));
        TVEpisode[] tvEpisodes = {ep1, ep2, ep3};
        TVSeason mrRobotSeason1 = new TVSeason(tvEpisodes);

        // Orden 1: Orden descendente por fecha de emisión
        //          y luego desempata ascendente por identificador
        for(TVEpisode tvEpisode : mrRobotSeason1.getDateOrderCopy()) {
            System.out.println(tvEpisode);
        }
        // (89) Episode 2_d3bug.mkv aired on 2022-09-20 has 8.90 rating
        // (234) Episode 0_hellofriend.mov aired on 2022-09-19 has 8.50 rating
        // (235) Episode 1_ones-and-zer0es.mpeg aired on 2022-09-19 has 9.20 rating

        // Orden 2: Orden alfabético por nombre
        //          y luego desempata ascendente por identificador
        for(TVEpisode tvEpisode : mrRobotSeason1.getNameOrderCopy()) {
            System.out.println(tvEpisode);
        }
        // (234) Episode 0_hellofriend.mov aired on 2022-09-19 has 8.50 rating
        // (235) Episode 1_ones-and-zer0es.mpeg aired on 2022-09-19 has 9.20 rating
        // (89) Episode 2_d3bug.mkv aired on 2022-09-20 has 8.90 rating

        // Orden 3: Orden descendente por rating
        //          y luego desempata ascendente por identificador
        for(TVEpisode tvEpisode : mrRobotSeason1.getRatingOrderCopy()) {
            System.out.println(tvEpisode);
        }
        // (235) Episode 1_ones-and-zer0es.mpeg aired on 2022-09-19 has 9.20 rating
        // (89) Episode 2_d3bug.mkv aired on 2022-09-20 has 8.90 rating
        // (234) Episode 0_hellofriend.mov aired on 2022-09-19 has 8.50 rating
    }
}
*/
