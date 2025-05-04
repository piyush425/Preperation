//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.net.URLEncoder;
//import java.util.ArrayList;
//import java.util.List;
//
//
//class Result {
//    public static List<String> getRelevantFoodOutlets(String city, int maxCost) {
//        List<String> result = new ArrayList<>();
//        int page = 1;
//        int totalPages = 1;
//
//        try {
//            String encodedCity = URLEncoder.encode(city, "UTF-8"); // Ensure city is URL encoded
//
//            do {
//                String apiUrl = "https://jsonmock.hackerrank.com/api/food_outlets?city=" + encodedCity + "&page=" + page;
//                HttpURLConnection conn = (HttpURLConnection) new URL(apiUrl).openConnection();
//                conn.setRequestMethod("GET");
//
//                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//                StringBuilder response = new StringBuilder();
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    response.append(line);
//                }
//                reader.close();
//
//                JSONObject jsonResponse = new JSONObject(response.toString());
//                totalPages = jsonResponse.getInt("total_pages");
//                JSONArray data = jsonResponse.getJSONArray("data");
//
//                for (int i = 0; i < data.length(); i++) {
//                    JSONObject outlet = data.getJSONObject(i);
//                    if (outlet.getInt("estimated_cost") <= maxCost) {
//                        result.add(outlet.getString("name").trim()); // Trim to avoid extra spaces
//                    }
//                }
//                page++;
//            } while (page <= totalPages);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//}
//
////public class PracticeNew {
////    public static void main(String[] args) {
////        String city = "Denver";
////        int maxCost = 50;
////        List<String> outlets = Result.getRelevantFoodOutlets(city, maxCost);
////
////        for (String outlet : outlets) {
////            System.out.println(outlet);
////        }
////    }
////}
