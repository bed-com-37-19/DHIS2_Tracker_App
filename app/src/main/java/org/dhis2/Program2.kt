package org.dhis2

import com.fasterxml.jackson.annotation.JsonProperty

data class Program2(
        @JsonProperty("uid")
        val uid: String,
        val name: String,

)
