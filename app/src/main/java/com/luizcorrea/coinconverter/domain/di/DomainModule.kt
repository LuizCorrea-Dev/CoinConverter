package com.luizcorrea.coinconverter.domain.di

import com.luizcorrea.coinconverter.domain.GetExchangeValueUseCase
import com.luizcorrea.coinconverter.domain.ListExchangeUseCase
import com.luizcorrea.coinconverter.domain.SaveExchangeUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModules())
    }

    private fun useCaseModules(): Module {
        return module {
            factory { ListExchangeUseCase(get()) }
            factory { SaveExchangeUseCase(get()) }
            factory { GetExchangeValueUseCase(get()) }
        }
    }
}