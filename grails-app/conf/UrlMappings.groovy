class UrlMappings {

    static mappings = {
        group "/rest", {
            "/$controller/$action?/$id?"()
        }
    }
}