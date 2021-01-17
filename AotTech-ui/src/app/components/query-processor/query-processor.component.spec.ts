import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { QueryProcessorComponent } from './query-processor.component';

describe('QueryProcessorComponent', () => {
  let component: QueryProcessorComponent;
  let fixture: ComponentFixture<QueryProcessorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ QueryProcessorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(QueryProcessorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
