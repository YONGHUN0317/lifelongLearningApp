package yonghun.ksg.lifelonglearningapp

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import javax.inject.Inject

class SearchRepository @Inject constructor(private val apiService: ApiService) {

    fun getQuotes() = Pager(
        config = PagingConfig(pageSize = 20, maxSize = 80),
        pagingSourceFactory = { SearchPagingSource(apiService)
        }
    ).liveData
}