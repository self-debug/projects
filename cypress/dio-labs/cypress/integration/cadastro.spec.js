/// <reference types="cypress" />

beforeEach(() => {
    cy.visit('https://shopee.com.br/')
}

)    

describe('Buscar', () => {

it ('Buscar Produto', () => {
    
    cy.get('.shopee-searchbar-input__input').type('xiaomi')
    cy.get('.btn > .shopee-svg-icon').click();
    cy.get('.shopee-location-filter > .folding-items > :nth-child(1) > .shopee-checkbox > .shopee-checkbox__control > .shopee-checkbox__box > i').click();
    cy.get('.shopee-sort-by-options > :nth-child(2)').click();
    cy.get('.shopee-facet-filter > .folding-items > :nth-child(2) > .shopee-checkbox > .shopee-checkbox__control > .shopee-checkbox__box > i').click();



})

})

