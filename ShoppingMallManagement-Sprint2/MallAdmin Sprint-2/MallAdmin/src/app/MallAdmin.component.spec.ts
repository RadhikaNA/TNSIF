import { TestBed } from '@angular/core/testing';
import { MallAdminComponent } from './MallAdmin.component';
import { MallAdminService } from './MallAdmin.service';
import { of } from 'rxjs';

describe('MallAdminComponent', () => {
  let mockMallAdminService: jasmine.SpyObj<MallAdminService>;

  beforeEach(async () => {
    mockMallAdminService = jasmine.createSpyObj('MallAdminService', ['getMallAdmins']);
    mockMallAdminService.getMallAdmins.and.returnValue(of([])); // Mock response

    await TestBed.configureTestingModule({
      declarations: [MallAdminComponent],
      providers: [{ provide: MallAdminService, useValue: mockMallAdminService }],
    }).compileComponents();
  });

  it('should create the component', () => {
    const fixture = TestBed.createComponent(MallAdminComponent);
    const component = fixture.componentInstance;
    expect(component).toBeTruthy();
  });

  it(`should have as title 'Mall Admin'`, () => {
    const fixture = TestBed.createComponent(MallAdminComponent);
    const component = fixture.componentInstance;
    expect(component.title).toEqual('Mall Admin');
  });

  it('should call getMallAdmins on init', () => {
    const fixture = TestBed.createComponent(MallAdminComponent);
    const component = fixture.componentInstance;
    spyOn(component, 'getMallAdmins');
    component.ngOnInit();
    expect(component.getMallAdmins).toHaveBeenCalled();
  });

  it('should fetch mall admins from the service', () => {
    const fixture = TestBed.createComponent(MallAdminComponent);
    const component = fixture.componentInstance;
    component.getMallAdmins();
    expect(mockMallAdminService.getMallAdmins).toHaveBeenCalled();
  });
});
