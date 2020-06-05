package com.example.marveldesafio.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.marveldesafio.model.Comic
import com.example.marveldesafio.repository.RepositoryMarvel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class ViewModelMarvel : ViewModel() {

    var listMutableComic = MutableLiveData<MutableSet<Comic>>()
    private val repositoryMarvel = RepositoryMarvel()

    fun getAllComics() = CoroutineScope(IO).launch {
        repositoryMarvel.getComicService().let {
            listMutableComic.postValue(it.data.results)
        }
    }
}