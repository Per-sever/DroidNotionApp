package com.example.droidnotionapp.data.network.models


data class CategoryDTO (
    var id: String? = null,
    var type: String? = null,
    var multiSelect: List<MultiSelectDTO> = ArrayList<MultiSelectDTO>(),
)