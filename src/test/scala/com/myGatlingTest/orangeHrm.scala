package com.myGatlingTest

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class orangeHrm extends Simulation {

	val httpProtocol = http
		.baseUrl("https://opensource-demo.orangehrmlive.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("fr-FR,fr;q=0.9,en-US;q=0.8,en;q=0.7")
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "none",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """"Chromium";v="110", "Not A(Brand";v="24", "Google Chrome";v="110"""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> """"Linux"""")

	val headers_1 = Map("Content-Type" -> "application/json; charset=utf-8")

	val headers_2 = Map(
		"Accept" -> "application/json",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"contentType" -> "application/json",
		"sec-ch-ua" -> """"Chromium";v="110", "Not A(Brand";v="24", "Google Chrome";v="110"""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> """"Linux"""")

	val headers_3 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Origin" -> "https://opensource-demo.orangehrmlive.com",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """"Chromium";v="110", "Not A(Brand";v="24", "Google Chrome";v="110"""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> """"Linux"""")

	val headers_5 = Map(
		"Content-Type" -> "application/x-protobuf",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "none",
		"authorization" -> "Bearer ya29.a0AVvZVspjZG2-xWMeS0lOz90QnaPJDBcwEWiKdz8ZT1K2RLaGLdj8IdJmScmyB2B-y73i-Tww17AMkP8bbxMgADCbm22wNAXlCNw2shHl2zN_6_UVTW_BpEzb9EURdkh5K7e6fjaUubRPdjn_AlCsuoTFlR7IJa2k60tMCwxzT1HDHQssUQUJwo6jYRe_2tRZX8TH_vc2-CVylb8bp4X6DV2lLJlAQp8b8BFh3SAO4VOg3H1jDoIyFAfIAgAvJLlaHl2saCgYKAcESARISFQGbdwaIQzrCNVmKwF9FRk9tF_WP3Q0267")

	val headers_6 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """"Chromium";v="110", "Not A(Brand";v="24", "Google Chrome";v="110"""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> """"Linux"""")

	val headers_7 = Map(
		"Accept" -> "application/json",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """"Chromium";v="110", "Not A(Brand";v="24", "Google Chrome";v="110"""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> """"Linux"""")

	val headers_8 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """"Chromium";v="110", "Not A(Brand";v="24", "Google Chrome";v="110"""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> """"Linux"""")

	val headers_12 = Map(
		"Accept" -> "application/json",
		"Origin" -> "https://opensource-demo.orangehrmlive.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """"Chromium";v="110", "Not A(Brand";v="24", "Google Chrome";v="110"""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> """"Linux"""")

	val headers_20 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """"Chromium";v="110", "Not A(Brand";v="24", "Google Chrome";v="110"""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> """"Linux"""")

    val uri2 = "https://passwordsleakcheck-pa.googleapis.com/v1/leaks:lookupSingle"
    val uri3 = "https://beacons5.gvt3.com/domainreliability/upload"

	val scn = scenario("orangeHrm")
		.exec(http("request_0")
			.get("/web/index.php/auth/login")
			.headers(headers_0)
			.resources(http("request_1")
			.post(uri3)
			.headers(headers_1)
			.body(RawFileBody("com/myGatlingTest/orangehrm/0001_request.json")),
            http("request_2")
			.get("/web/index.php/core/i18n/messages")
			.headers(headers_2)))
		.pause(12)
		.exec(http("request_3")
			.post("/web/index.php/auth/validate")
			.headers(headers_3)
			.formParam("_token", "3108f774eca3e2d4be06f6e08ab87f.HdnwaSWRbVdQINGHg46_oUcwI3jqx_pP3tW3GIFB5L0.KrW3REelBx00EbjEsdzS8A8HZ0GppMJ25qTOXvQ0nIxsjbMGb_RbDwpWmA")
			.formParam("username", "Admin")
			.formParam("password", "admin123")
			.resources(http("request_4")
			.get("/web/index.php/core/i18n/messages")
			.headers(headers_2),
            http("request_5")
			.post(uri2)
			.headers(headers_5)
			.body(RawFileBody("com/myGatlingTest/orangehrm/0005_request.dat")),
            http("request_6")
			.get("/web/index.php/pim/viewPhoto/empNumber/7")
			.headers(headers_6),
            http("request_7")
			.get("/web/index.php/api/v2/dashboard/employees/time-at-work?timezoneOffset=1&currentDate=2023-03-07&currentTime=12:43")
			.headers(headers_7),
            http("request_8")
			.get("/web/index.php/api/v2/buzz/feed?limit=5&offset=0&sortOrder=DESC&sortField=share.createdAtUtc")
			.headers(headers_8),
            http("request_9")
			.get("/web/index.php/api/v2/dashboard/employees/action-summary")
			.headers(headers_7),
            http("request_10")
			.get("/web/index.php/api/v2/dashboard/employees/leaves?date=2023-03-07")
			.headers(headers_7),
            http("request_11")
			.get("/web/index.php/api/v2/dashboard/shortcuts")
			.headers(headers_7),
            http("request_12")
			.post("/web/index.php/events/push")
			.headers(headers_12),
            http("request_13")
			.get("/web/index.php/api/v2/dashboard/employees/subunit")
			.headers(headers_7),
            http("request_14")
			.get("/web/index.php/pim/viewPhoto/empNumber/2")
			.headers(headers_6),
            http("request_15")
			.get("/web/index.php/buzz/photo/12")
			.headers(headers_6),
            http("request_16")
			.get("/web/index.php/api/v2/dashboard/employees/locations")
			.headers(headers_7),
            http("request_17")
			.get("/web/index.php/buzz/photo/11")
			.headers(headers_6),
            http("request_18")
			.get("/web/index.php/pim/viewPhoto/empNumber/15")
			.headers(headers_6),
            http("request_19")
			.get("/web/index.php/pim/viewPhoto/empNumber/22")
			.headers(headers_6)))
		.pause(3)
		.exec(http("request_20")
			.get("/web/index.php/admin/viewAdminModule")
			.headers(headers_20)
			.resources(http("request_21")
			.get("/web/index.php/core/i18n/messages")
			.headers(headers_2),
            http("request_22")
			.get("/web/index.php/pim/viewPhoto/empNumber/7")
			.headers(headers_6),
            http("request_23")
			.get("/web/index.php/api/v2/admin/users?limit=50&offset=0&sortField=u.userName&sortOrder=ASC")
			.headers(headers_7)))
		.pause(5)
		.exec(http("request_24")
			.get("/web/index.php/api/v2/admin/users?limit=50&offset=0&username=Admin&sortField=u.userName&sortOrder=ASC")
			.headers(headers_7))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}